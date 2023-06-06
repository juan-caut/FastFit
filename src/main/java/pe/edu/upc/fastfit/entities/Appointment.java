package pe.edu.upc.fastfit.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAppointment;

    @Column(name = "date", nullable = false)
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "psychologist")
    private Psychologist psychologist;
    @ManyToOne
    @JoinColumn(name = "appointmentstatus")
    private AppointmentStatus appointmentstatus;

    public Appointment() {
    }

    public Appointment(int idAppointment, LocalDate date, Client client, Psychologist psychologist, AppointmentStatus appointmentStatus) {
        this.idAppointment = idAppointment;
        this.date = date;
        this.client = client;
        this.psychologist = psychologist;
        this.appointmentstatus = appointmentStatus;
    }

    public int getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(int idAppointment) {
        this.idAppointment = idAppointment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Psychologist getPsychologist() {
        return psychologist;
    }

    public void setPsychologist(Psychologist psychologist) {
        this.psychologist = psychologist;
    }

    public AppointmentStatus getAppointmentStatus() {
        return appointmentstatus;
    }

    public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
        this.appointmentstatus = appointmentStatus;
    }
}
