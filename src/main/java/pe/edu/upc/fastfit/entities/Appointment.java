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
    @Column(name = "Client_id", length = 30, nullable = false)
    private int Client_id;
    @Column(name = "Psychologist_id", length = 30, nullable = false)
    private int Psychologist_id;
    @Column(name = "AppointmentStatus_id", length = 30, nullable = false)
    private int AppointmentStatus_id;

    public Appointment() {
    }

    public Appointment(int id, LocalDate date, int Client_id, int Psychologist_id, int AppointmentStatus_id) {
        this.idAppointment = id;
        this.date = date;
        this.AppointmentStatus_id = AppointmentStatus_id;
        this.Psychologist_id = Psychologist_id;
        this.Client_id = Client_id;

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

    public int getClient_id() {
        return Client_id;
    }

    public void setClient_id(int client_id) {
        Client_id = client_id;
    }

    public int getPsychologist_id() {
        return Psychologist_id;
    }

    public void setPsychologist_id(int psychologist_id) {
        Psychologist_id = psychologist_id;
    }

    public int getAppointmentStatus_id() {
        return AppointmentStatus_id;
    }

    public void setAppointmentStatus_id(int appointmentStatus_id) {
        AppointmentStatus_id = appointmentStatus_id;
    }
}
