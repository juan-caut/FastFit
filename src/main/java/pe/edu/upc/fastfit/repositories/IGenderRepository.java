package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.fastfit.entities.Gender;

@Repository
public interface IGenderRepository extends JpaRepository<Gender,Integer> {
}
