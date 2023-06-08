package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.fastfit.entities.Appointment;


import java.time.LocalDate;
import java.util.List;

public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {
    //Leonardo LLiuya (1)
    @Query("SELECT a from Appointment  a where  a.idAppointment BETWEEN :startid and :endid")
    List<Appointment> buscarid(@Param("startid") int startid, @Param("endid") int endid);

    //Leonardo LLiuya (2)

    @Query("SELECT a from Appointment  a where  a.date BETWEEN :startdate and :enddate")

    List<Appointment> buscardate(@Param("startdate") LocalDate startdate,@Param("enddate") LocalDate enddate);


}
