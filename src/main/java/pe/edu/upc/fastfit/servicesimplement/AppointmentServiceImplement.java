package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.Appointment;
import pe.edu.upc.fastfit.repositories.IAppointmentRepository;
import pe.edu.upc.fastfit.services.IAppointmentService;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentServiceImplement implements IAppointmentService {
    @Autowired
    private IAppointmentRepository aR;

    @Override
    public void insert(Appointment appointment) {
        aR.save(appointment);
    }

    @Override
    public List<Appointment> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAppointment) {
aR.deleteById(idAppointment);
    }

    @Override
    public Appointment listId(int idAppointment) {
        return aR.findById(idAppointment).orElse(new Appointment());
    }

    @Override
    public List<Appointment> buscarxid(int startid, int endid) {
        return aR.buscarid(startid, endid);
    }

    @Override
    public List<Appointment> buscar_Fecha(LocalDate starDate) {
        return aR.buscardate(starDate);
    }

}
