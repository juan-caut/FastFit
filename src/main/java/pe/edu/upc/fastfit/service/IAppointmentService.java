package pe.edu.upc.fastfit.service;

import pe.edu.upc.fastfit.entities.Appointment;

import java.util.List;

public interface IAppointmentService {
public void insert(Appointment appointment);
List<Appointment> list();
public void delete(int idAppointment);
public Appointment listId(int idAppointment);
}
