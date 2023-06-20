package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.Payment;
import pe.edu.upc.fastfit.repositories.IPaymentRepository;
import pe.edu.upc.fastfit.services.IPaymentService;

import java.util.List;

@Service
public class PaymentServiceImplement implements IPaymentService {

    @Autowired
    private IPaymentRepository pR;

    @Override
    public void insert(Payment payment) {
        pR.save(payment);
    }

    @Override
    public List<Payment> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPayment) {
        pR.deleteById(idPayment);
    }

    @Override
    public Payment listId(int idPayment) {
        return pR.findById(idPayment).orElse(new Payment());
    }

    @Override
    public List<Payment> byPsi(int idPsi) {
        return pR.byPsi(idPsi);
    }

    @Override
    public List<Payment> byCli(int idCli) {
        return pR.byClient(idCli);
    }
}
