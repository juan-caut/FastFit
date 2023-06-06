package pe.edu.upc.fastfit.services;

import pe.edu.upc.fastfit.entities.Appointment;

import java.time.LocalDate;
import java.util.List;

public interface IAppointmentService {
    public void insert(Appointment appointment);

    List<Appointment> list();

    public void delete(int idAppointment);

    public Appointment listId(int idAppointment);

    List<Appointment> buscarxid(int startid, int endid);

    List<Appointment> buscar_Fecha(LocalDate starDate);
}
