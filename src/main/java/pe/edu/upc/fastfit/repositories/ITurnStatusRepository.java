package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.fastfit.entities.TurnStatus;

@Repository
public interface ITurnStatusRepository extends JpaRepository<TurnStatus, Integer> {

}
