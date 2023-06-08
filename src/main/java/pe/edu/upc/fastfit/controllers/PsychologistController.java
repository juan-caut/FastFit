package pe.edu.upc.fastfit.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.entities.Psychologist;
import pe.edu.upc.fastfit.services.IPsychologistService;
import pe.edu.upc.fastfit.dtos.PsychologistDTO;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Psychologists")
public class PsychologistController {

    @Autowired
    private IPsychologistService pS;
    @PostMapping
    public void insert(@RequestBody PsychologistDTO dto){
        ModelMapper m=new ModelMapper();
        Psychologist p=m.map(dto,Psychologist.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PsychologistDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PsychologistDTO.class);
        }).collect(Collectors.toList());
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PsychologistDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PsychologistDTO dto=m.map(pS.listId(id),PsychologistDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody PsychologistDTO dto) {
        ModelMapper m = new ModelMapper();
        Psychologist p = m.map(dto, Psychologist.class);
        pS.insert(p);
    }

    @PostMapping("/buscarPsicologoEspe")
    public List<PsychologistDTO> findPsicoSpec(@RequestBody String Specialty) {
        return pS.findBySpecialtyPsico(Specialty).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PsychologistDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscarporGender")
    public List<PsychologistDTO> fndGenderPSY( String gender) {
        return pS.finByGender(gender).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PsychologistDTO.class);
        }).collect(Collectors.toList());
    }
}
