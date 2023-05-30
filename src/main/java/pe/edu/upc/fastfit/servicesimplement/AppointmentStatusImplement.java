package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.AppointmentStatus;
import pe.edu.upc.fastfit.repositories.IAppointmentStatusRepository;
import pe.edu.upc.fastfit.services.IAppointmentStatusService;

import java.util.List;

@Service
public class AppointmentStatusImplement implements IAppointmentStatusService {
    @Autowired
    private IAppointmentStatusRepository aR;

    @Override
    public void insert(AppointmentStatus appoStatus) {
        aR.save(appoStatus);
    }

    @Override
    public List<AppointmentStatus> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAppoStatus) {
        aR.deleteById(idAppoStatus);

    }

    @Override
    public AppointmentStatus listId(int idAppoStatus) {
        return aR.findById(idAppoStatus).orElse(new AppointmentStatus());
    }
}
