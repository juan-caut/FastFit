package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.ClientDTO;
import pe.edu.upc.fastfit.dtos.ClientStatsDTO;
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
    @PreAuthorize("hasAnyAuthority('ADMIN','USER')")
    public void insert(@RequestBody ClientDTO dto) {
        ModelMapper m = new ModelMapper();
        Client c = m.map(dto, Client.class);
        cS.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'PSICO','USER')")
    public List<ClientDTO> list() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ClientDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public ClientDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ClientDTO dto = m.map(cS.listId(id), ClientDTO.class);
        return dto;
    }

    @PutMapping
    public void update(@RequestBody ClientDTO dto) {
        ModelMapper m = new ModelMapper();
        Client c = m.map(dto, Client.class);
        cS.insert(c);
    }

    @PostMapping("/buscarEdad")
    @PreAuthorize("hasAnyAuthority('ADMIN','USER')")
    public List<ClientDTO> buscarEdad(int min, int max) {
        return cS.findByAge(min, max).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ClientDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/byPsi")
    public List<ClientDTO> byPsi(int idPsi) {
        return cS.byPsi(idPsi).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ClientDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscarNombre")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ClientDTO> buscarNombre(@RequestBody String name) {
        return cS.findByName(name).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ClientDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/clientStats")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<ClientStatsDTO> clientStats() {
        List<ClientStatsDTO> clientsStats = cS.clientStats();
        return clientsStats;
    }

}

