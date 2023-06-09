package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.dtos.SpecialtyPsiDTO;
import pe.edu.upc.fastfit.entities.Psychologist;
import pe.edu.upc.fastfit.repositories.IPsychologistRepository;
import pe.edu.upc.fastfit.services.IPsychologistService;

import java.util.ArrayList;
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

    @Override
    public List<Psychologist> findBySpecialtyPsico(String Specialty) {
        return pR.findBySpecialtyPsico(Specialty);
    }

    @Override
    public List<Psychologist> finByGender(String gender) {
        return pR.finByGender(gender);
    }

    @Override
    public List<Psychologist> findByAgePsychologist(int Age) {
        return pR.findByAgePsychologist(Age);
    }

    @Override
    public List<SpecialtyPsiDTO> reporte01() {
        List<String[]> specCountByPsi = pR.getSpecCountByPsi();
        List<SpecialtyPsiDTO> SpecialtyPsiDTOs = new ArrayList<>();

        for (String[] data : specCountByPsi) {
            SpecialtyPsiDTO dto = new SpecialtyPsiDTO();
            dto.setSpecialtyName(data[0]);
            dto.setSpeCount(Integer.parseInt(data[1]));
            SpecialtyPsiDTOs.add(dto);
        }

        return SpecialtyPsiDTOs;
    }

}
