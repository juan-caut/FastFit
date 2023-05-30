package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.Gender;
import pe.edu.upc.fastfit.entities.Psychologist;
import pe.edu.upc.fastfit.repositories.IGenderRepository;
import pe.edu.upc.fastfit.services.IGenderService;

import java.util.List;


@Service
public class GenderServiceImplement implements IGenderService {
    @Autowired
    private IGenderRepository gR;

    @Override
    public void insert(Gender gender) {
        gR.save(gender);
    }

    @Override
    public List<Gender> list() {
        return gR.findAll();
    }

    @Override
    public void delete(int idGender) {
        gR.deleteById(idGender);
    }

    @Override
    public Gender listId(int idGender) {
        return gR.findById(idGender).orElse(new Gender());
    }

}
