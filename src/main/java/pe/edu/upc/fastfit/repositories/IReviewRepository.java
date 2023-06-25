package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.fastfit.dtos.ReviewpsyDTO;
import pe.edu.upc.fastfit.entities.Review;

import java.util.List;

@Repository
public interface IReviewRepository extends JpaRepository<Review, Integer> {
    @Query(value="SELECT p.names, AVG(r.likes), SUM(r.likes),MAX(r.likes),Min(r.likes)\n" +
            "from reviews r\n" +
            "join psychologists p on  r.id_psi = p.id_psi \n" +
            "group by p.names \n" +
            "ORDER BY SUM(r.likes) DESC", nativeQuery = true)
    List<String[]> byPsi();
}
