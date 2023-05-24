package pe.edu.upc.fastfit.services;

import pe.edu.upc.fastfit.entities.Payment;

import java.util.List;

public interface IPaymentService {
    public void insert(Payment payment);

    List<Payment> list();


}
