package pe.edu.upc.fastfit.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPayment;

    @Column(name = "paymentCode", length = 20, nullable = false)
    private String paymentCode;

    @Column(name = "idAppointment", nullable = false)
    private int idAppointment;

    @Column(name = "cardNumber", length = 20, nullable = false)
    private String cardNumber;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "pago", nullable = false)
    private float pago;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "cvv", nullable = false)
    private int  cvv;

    @Column(name = "expiration", nullable = false)
    private LocalDate expiration;

    @Column(name = "email", nullable = false)
    private String email;


    public Payment() {
    }

    public Payment(int idPayment, String paymentCode, int idAppointment, String cardNumber, LocalDate date, String currency, float pago, String name, String lastname, int cvv, LocalDate expiration, String email) {

        this.idPayment = idPayment;
        this.paymentCode = paymentCode;
        this.idAppointment = idAppointment;
        this.cardNumber = cardNumber;
        this.date = date;
        this.currency = currency;
        this.pago = pago;
        this.name = name;
        this.lastname = lastname;
        this.cvv = cvv;
        this.expiration = expiration;
        this.email = email;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public int getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(int idAppointment) {
        this.idAppointment = idAppointment;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
