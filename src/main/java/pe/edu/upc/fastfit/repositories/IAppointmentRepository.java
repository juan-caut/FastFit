package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.fastfit.entities.Appointment;


import java.time.LocalDate;
import java.util.List;

public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {
    @Query("SELECT a from Appointment  a where  a.idAppointment BETWEEN :startid and :endid")
    List<Appointment>buscarid(@Param("startid") int startid,@Param("endid")int endid);
    @Query("from Appointment v where v.date =:fecha")
    List<Appointment>buscardate(@Param("fecha") LocalDate fecha);


}
