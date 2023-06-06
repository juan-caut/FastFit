package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    private IAppointmentStatusService aS;

    @PostMapping
    private void insert(@RequestBody AppointmentStatusDTO dto) {
        ModelMapper m = new ModelMapper();
        AppointmentStatus a = m.map(dto, AppointmentStatus.class);
        aS.insert(a);
    }

    @GetMapping
    public List<AppointmentStatusDTO> list() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AppointmentStatusDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public AppointmentStatusDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        AppointmentStatusDTO dto = m.map(aS.listId(id), AppointmentStatusDTO.class);
        return dto;
    }

    @PutMapping
    public void update(@RequestBody AppointmentStatusDTO dto) {
        ModelMapper m = new ModelMapper();
        AppointmentStatus a = m.map(dto, AppointmentStatus.class);
        aS.insert(a);
    }

}
