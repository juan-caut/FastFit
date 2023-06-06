package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.fastfit.dtos.UserStatusDTO;
import pe.edu.upc.fastfit.entities.UserStatus;
import pe.edu.upc.fastfit.services.IUserStatusService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/UserStatuss")
public class UserStatusController {
    @Autowired
    private IUserStatusService jH;
    @PostMapping
    public void insert(@RequestBody UserStatusDTO dto){
        ModelMapper m=new ModelMapper();
        UserStatus p=m.map(dto,UserStatus.class);
        jH.insert(p);
    }

    @GetMapping
    public List<UserStatusDTO> list(){
        return jH.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UserStatusDTO.class);
        }).collect(Collectors.toList());
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        jH.delete(id);
    }

    @GetMapping("/{id}")
    public UserStatusDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UserStatusDTO dto=m.map(jH.listId(id),UserStatusDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody UserStatusDTO dto) {
        ModelMapper m = new ModelMapper();
        UserStatus p = m.map(dto, UserStatus.class);
        jH.insert(p);
    }
}
