package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.Appointment;
import pe.edu.upc.fastfit.entities.AppointmentStatus;
import pe.edu.upc.fastfit.entities.Review;
import pe.edu.upc.fastfit.repositories.IAppointmentStatusRepository;
import pe.edu.upc.fastfit.services.IAppointmentService;
import pe.edu.upc.fastfit.services.IAppointmentStatusService;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentStatusServiceImplement implements IAppointmentStatusService {

    @Autowired
    private IAppointmentStatusRepository rR;

    @Override
    public void insert(AppointmentStatus appointmentStatus) {
        rR.save(appointmentStatus);
    }
    @Override
    public List<AppointmentStatus> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idAppStatus) {
        rR.deleteById(idAppStatus);
    }

    @Override
    public AppointmentStatus listId(int idAppStatus) {
        return rR.findById(idAppStatus).orElse(new AppointmentStatus());
    }
}
