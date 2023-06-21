package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.GenderDTO;
import pe.edu.upc.fastfit.dtos.PsychologistDTO;
import pe.edu.upc.fastfit.entities.Gender;
import pe.edu.upc.fastfit.entities.Psychologist;
import pe.edu.upc.fastfit.services.IGenderService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/genders")
public class GenderController {
    @Autowired
    private IGenderService gS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody GenderDTO dto){
        ModelMapper m=new ModelMapper();
        Gender g=m.map(dto, Gender.class);
        gS.insert(g);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<GenderDTO> list() {
        return gS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GenderDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id) {
        gS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public GenderDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        GenderDTO dto=m.map(gS.listId(id),GenderDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void update(@RequestBody GenderDTO dto) {
        ModelMapper m = new ModelMapper();
        Gender p = m.map(dto, Gender.class);
        gS.insert(p);
    }
}
