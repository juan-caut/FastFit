package pe.edu.upc.fastfit.services;

import pe.edu.upc.fastfit.dtos.ReportePagosDTO;
import pe.edu.upc.fastfit.entities.Payment;

import java.util.List;

public interface IPaymentService {
    public void insert(Payment payment);

    List<Payment> list();

    public void delete(int idPayment);

    public Payment listId(int idPayment);

    List<Payment> byPsi(int idPsi);
    List<Payment> byCli(int idCli);

    ReportePagosDTO reporte1();

}
