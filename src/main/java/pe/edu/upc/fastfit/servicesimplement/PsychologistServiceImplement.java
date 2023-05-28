package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.Psychologist;
import pe.edu.upc.fastfit.repositories.IPsychologistRepository;
import pe.edu.upc.fastfit.services.IPsychologistService;
import java.util.List;
@Service
public class PsychologistServiceImplement implements IPsychologistService {

   @Autowired
    private IPsychologistRepository pR;

    @Override
    public void insert(Psychologist psychologist) {
        pR.save(psychologist);
    }

    @Override
    public List<Psychologist> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPsychologist) {
        pR.deleteById(idPsychologist);
    }

    @Override
    public Psychologist listId(int idPsychologist) {
        return pR.findById(idPsychologist).orElse(new Psychologist());
    }
}
