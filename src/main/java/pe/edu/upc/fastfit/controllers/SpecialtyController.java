package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.SpecialtyDTO;
import pe.edu.upc.fastfit.entities.Specialty;
import pe.edu.upc.fastfit.services.ISpacialtyService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/specialties")
public class SpecialtyController {

    @Autowired
    private ISpacialtyService ps;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody SpecialtyDTO dto){
        ModelMapper m= new ModelMapper();
        Specialty s = m.map(dto, Specialty.class);
        ps.insert(s);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<SpecialtyDTO> list(){
        return ps.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SpecialtyDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id){
        ps.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public SpecialtyDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        SpecialtyDTO dto = m.map(ps.listId(id),SpecialtyDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void update (@RequestBody SpecialtyDTO dto){
        ModelMapper m= new ModelMapper();
        Specialty s = m.map(dto, Specialty.class);
        ps.insert(s);
    }
}
