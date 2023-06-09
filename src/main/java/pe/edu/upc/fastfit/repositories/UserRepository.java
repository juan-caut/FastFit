package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.fastfit.entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);

    public Users findByUsername(String username);

@Transactional
    @Modifying
@Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);
}
