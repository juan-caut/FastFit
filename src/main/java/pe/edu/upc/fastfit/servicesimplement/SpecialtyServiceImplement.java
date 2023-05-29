package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.Specialty;
import pe.edu.upc.fastfit.repositories.ISpecialtyRepository;
import pe.edu.upc.fastfit.services.ISpacialtyService;

import java.util.List;

@Service
public class SpecialtyServiceImplement implements ISpacialtyService {
    @Autowired
    private ISpecialtyRepository pR;


    @Override
    public void insert(Specialty specialty) {
        pR.save(specialty);
    }

    @Override
    public List<Specialty> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idSpecialty) {
        pR.deleteById(idSpecialty);
    }

    @Override
    public Specialty listId(int idSpecialty) {
        return pR.findById(idSpecialty).orElse(new Specialty());
    }
}
