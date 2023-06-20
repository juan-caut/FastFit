package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.fastfit.entities.Client;

import java.util.List;

@Repository
public interface IClientRepository extends JpaRepository<Client,Integer>{


    @Query("from Client c where c.age between :min and :max")
    List<Client> findByAge(@Param("min") int min, @Param("max") int max);

    @Query("from Client c where c.age=:name")
    List<Client> findByName(@Param("name") String name);

    // where Appointment.psychologist.idPsi=:idPsico
//join Appointment on Client.idClient=Appointment.client.idClient
    @Query(value = "select c from Client c where c.idClient in (select a.client from Appointment a where a.psychologist.idPsi=:idPsico)")
    List<Client> byPsi(@Param("idPsico") int idPsico);
}
