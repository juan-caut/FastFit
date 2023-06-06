package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.TurnStatusDTO;
import pe.edu.upc.fastfit.entities.TurnStatus;
import pe.edu.upc.fastfit.services.ITurnStatusService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/turnstatus")
public class TurnStatusController {

    @Autowired
    private ITurnStatusService tursS;

    @PostMapping
    public void insert(@RequestBody TurnStatusDTO dto) {
        ModelMapper m = new ModelMapper();
        TurnStatus p = m.map(dto, TurnStatus.class);
        tursS.insert(p);
    }

    @GetMapping
    public List<TurnStatusDTO> list() {
        return tursS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TurnStatusDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        tursS.delete(id);
    }

    @GetMapping("/{id}")
    public TurnStatusDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        TurnStatusDTO dto=m.map(tursS.listId(id),TurnStatusDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody TurnStatusDTO dto) {
        ModelMapper m = new ModelMapper();
        TurnStatus p = m.map(dto, TurnStatus.class);
        tursS.insert(p);
    }

}
