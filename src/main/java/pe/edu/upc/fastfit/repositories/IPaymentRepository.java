package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.fastfit.entities.Payment;

import java.util.List;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Integer> {
    @Query("select p from Payment p where p.idAppointment in (select a.idAppointment from Appointment a where a.turn.idTurn in (select t.idTurn from Turn t where t.psychologist.idPsi=:idPsi))")
    List<Payment> byPsi(@Param("idPsi")int idPsi);

@Query("select p from Payment p where p.idAppointment in (select a.idAppointment from Appointment a where a.client.idClient=:idCli)")
    List<Payment> byClient(@Param("idCli")int idCli);

}
