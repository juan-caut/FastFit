package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.ClientDTO;
import pe.edu.upc.fastfit.entities.Client;
import pe.edu.upc.fastfit.services.IClientService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private IClientService cS;

    @PostMapping
    public void insert(@RequestBody ClientDTO dto) {
        ModelMapper m = new ModelMapper();
        Client c = m.map(dto, Client.class);
        cS.insert(c);
    }

    @GetMapping
    public List<ClientDTO> list() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ClientDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public ClientDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ClientDTO dto=m.map(cS.listId(id),ClientDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody ClientDTO dto){
        ModelMapper m = new ModelMapper();
        Client c=m.map(dto,Client.class);
        cS.insert(c);
    }

}
