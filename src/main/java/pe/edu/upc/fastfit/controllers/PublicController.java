package pe.edu.upc.fastfit.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.ClientDTO;
import pe.edu.upc.fastfit.dtos.GenderDTO;
import pe.edu.upc.fastfit.entities.Client;
import pe.edu.upc.fastfit.services.IClientService;
import pe.edu.upc.fastfit.services.IGenderService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private IClientService cS;
    @Autowired
    private IGenderService gS;
    @GetMapping("/client")
    public List<ClientDTO> listc() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ClientDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/client")
    public void insertc(@RequestBody ClientDTO dto) {
        ModelMapper m = new ModelMapper();
        Client c = m.map(dto, Client.class);
        cS.insert(c);
    }
    @GetMapping("/genders")
    public List<GenderDTO> listg() {
        return gS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GenderDTO.class);
        }).collect(Collectors.toList());
    }
}
