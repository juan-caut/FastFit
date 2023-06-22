package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.AppointmentStatusDTO;
import pe.edu.upc.fastfit.entities.AppointmentStatus;
import pe.edu.upc.fastfit.services.IAppointmentStatusService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/appointmentstatus")
public class AppointmentStatusController {
    @Autowired
    private IAppointmentStatusService revS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody AppointmentStatusDTO dto) {
        ModelMapper m = new ModelMapper();
        AppointmentStatus p = m.map(dto, AppointmentStatus.class);
        revS.insert(p);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')|| hasAnyAuthority('USER')")
    public List<AppointmentStatusDTO> list() {
        return revS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AppointmentStatusDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id) {
        revS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('USER')|| hasAnyAuthority('ADMIN')")
    public AppointmentStatusDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        AppointmentStatusDTO dto=m.map(revS.listId(id),AppointmentStatusDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void update(@RequestBody AppointmentStatusDTO dto) {
        ModelMapper m = new ModelMapper();
        AppointmentStatus p = m.map(dto, AppointmentStatus.class);
        revS.insert(p);
    }
}
