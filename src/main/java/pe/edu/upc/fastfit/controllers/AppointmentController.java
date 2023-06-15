package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.AppointmentDTO;
import pe.edu.upc.fastfit.entities.Appointment;
import pe.edu.upc.fastfit.services.IAppointmentService;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private IAppointmentService aS;


    @PostMapping
    public void insert(@RequestBody AppointmentDTO dto) {
        ModelMapper m = new ModelMapper();
        Appointment p = m.map(dto, Appointment.class);
        aS.insert(p);

    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<AppointmentDTO> listar() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AppointmentDTO.class);
        }).collect(Collectors.toList());
    }

   /* @GetMapping
    public List<AppointmentDTO> list() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AppointmentDTO.class);
        }).collect(Collectors.toList());
    }*/
    //agregado
    @DeleteMapping("/{id}")

    @PreAuthorize("hasAuthority('USER')")
    public void delete(@PathVariable("id") Integer id) {
        aS.delete(id);

    }

    @GetMapping("/{id}")

    //@PreAuthorize("hasAuthority('ADMIN')")
    public AppointmentDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        AppointmentDTO dto = m.map(aS.listId(id), AppointmentDTO.class);
        return dto;
    }
    //agregado
    @PutMapping
    @PreAuthorize("hasAuthority('USER')")
    public void update(@RequestBody AppointmentDTO dto) {
        ModelMapper m = new ModelMapper();
        Appointment p = m.map(dto, Appointment.class);
        aS.insert(p);
    }
    @PostMapping("/buscarfecha")
    @PreAuthorize("hasAuthority('USER')")
    public List<AppointmentDTO> buscarfecha(@RequestBody LocalDate startDate) {
        return aS.buscar_Fecha(startDate).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AppointmentDTO.class);
        }).collect(Collectors.toList());

    }
    @PostMapping("/buscarxid")
    public List<AppointmentDTO> buscarxid(int startid, int endid) {
        return aS.buscarxid(startid, endid).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AppointmentDTO.class);
        }).collect(Collectors.toList());
    }
}
