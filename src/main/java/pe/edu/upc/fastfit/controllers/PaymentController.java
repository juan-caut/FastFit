package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.PaymentDTO;
import pe.edu.upc.fastfit.entities.Payment;
import pe.edu.upc.fastfit.services.IPaymentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private IPaymentService ps;

    @PostMapping
    @PreAuthorize("hasAuthority('USER')")
    public void insert(@RequestBody PaymentDTO dto) {
        ModelMapper m = new ModelMapper();
        Payment p = m.map(dto, Payment.class);
        ps.insert(p);
    }


    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<PaymentDTO> list() {
        return ps.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PaymentDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        ps.delete(id);
    }

    @GetMapping("/{id}")
    public PaymentDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        PaymentDTO dto = m.map(ps.listId(id),PaymentDTO.class);
        return dto;
    }

    @PutMapping
    public void update(@RequestBody PaymentDTO dto){
        ModelMapper m= new ModelMapper();
        Payment p = m.map(dto, Payment.class);
        ps.insert(p);
    }
    @PostMapping("/byPsi")
    public List<PaymentDTO> byPsi(int idPsi) {
        return ps.byPsi(idPsi).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PaymentDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/byClient")
    public List<PaymentDTO> byClient(int idClient) {
        return ps.byCli(idClient).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PaymentDTO.class);
        }).collect(Collectors.toList());
    }




}
