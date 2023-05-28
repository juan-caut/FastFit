package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.TurnDTO;
import pe.edu.upc.fastfit.entities.Turn;
import pe.edu.upc.fastfit.services.ITurnService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/turns")
public class TurnController {
    @Autowired
    private ITurnService turS;

    @PostMapping
    public void insert(@RequestBody TurnDTO dto) {
        ModelMapper m = new ModelMapper();
        Turn p = m.map(dto, Turn.class);
        turS.insert(p);
    }

    @GetMapping
    public List<TurnDTO> list() {
        return turS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TurnDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        turS.delete(id);
    }

    @GetMapping("/{id}")
    public TurnDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        TurnDTO dto=m.map(turS.listId(id),TurnDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody TurnDTO dto) {
        ModelMapper m = new ModelMapper();
        Turn p = m.map(dto, Turn.class);
        turS.insert(p);
    }
}
