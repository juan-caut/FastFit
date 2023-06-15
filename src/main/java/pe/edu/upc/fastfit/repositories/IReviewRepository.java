package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.fastfit.entities.Review;

import java.util.List;

@Repository
public interface IReviewRepository extends JpaRepository<Review, Integer> {
    @Query("select r from Review r where r.psychologist.idPsi=:idPsi")
    List<Review> byPsi(@Param("idPsi")int idPsi);
}
