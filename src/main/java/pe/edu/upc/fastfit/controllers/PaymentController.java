package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void insert(@RequestBody PaymentDTO dto) {
        ModelMapper m = new ModelMapper();
        Payment p = m.map(dto, Payment.class);
        ps.insert(p);
    }

    @GetMapping
    public List<PaymentDTO> list() {
        return ps.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PaymentDTO.class);
        }).collect(Collectors.toList());
    }
}
