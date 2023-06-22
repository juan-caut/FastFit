package pe.edu.upc.fastfit.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAppointment;
    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "appointmentstatus")
    private AppointmentStatus appointmentstatus;
    @ManyToOne
    @JoinColumn(name = "turns")
    private Turn turn;

    public Appointment() {
    }

    public Appointment(int idAppointment, LocalDate date, Client client, Psychologist psychologist, AppointmentStatus appointmentstatus, Turn turn) {
        this.idAppointment = idAppointment;

        this.client = client;
        this.appointmentstatus = appointmentstatus;
        this.turn = turn;
    }

    public int getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(int idAppointment) {
        this.idAppointment = idAppointment;
    }



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public AppointmentStatus getAppointmentstatus() {
        return appointmentstatus;
    }

    public void setAppointmentstatus(AppointmentStatus appointmentstatus) {
        this.appointmentstatus = appointmentstatus;
    }

    public Turn getTurn() {
        return turn;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }
}
