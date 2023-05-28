package pe.edu.upc.fastfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.fastfit.entities.Appointment;

public interface IAppointmentRepository extends JpaRepository<Appointment,Integer> {
}
