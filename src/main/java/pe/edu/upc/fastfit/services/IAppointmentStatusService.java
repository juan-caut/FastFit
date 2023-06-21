package pe.edu.upc.fastfit.services;

import pe.edu.upc.fastfit.entities.AppointmentStatus;
import pe.edu.upc.fastfit.entities.Review;

import java.util.List;

public interface IAppointmentStatusService {
    public void insert(AppointmentStatus appointmentStatus);
    List<AppointmentStatus> list();
    public void delete(int idAppStatus);
    public AppointmentStatus listId(int idAppStatus);
}
