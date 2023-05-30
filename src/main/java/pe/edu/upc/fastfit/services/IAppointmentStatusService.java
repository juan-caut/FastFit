package pe.edu.upc.fastfit.services;

import pe.edu.upc.fastfit.entities.AppointmentStatus;

import java.util.List;

public interface IAppointmentStatusService {
    public void insert(AppointmentStatus appoStatus);
    List<AppointmentStatus> list();
    public void delete(int idAppoStatus);
    public AppointmentStatus listId(int idAppoStatus);

}
