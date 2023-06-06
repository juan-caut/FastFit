package pe.edu.upc.fastfit.dtos;

import pe.edu.upc.fastfit.entities.AppointmentStatus;
import pe.edu.upc.fastfit.entities.Client;
import pe.edu.upc.fastfit.entities.Psychologist;

import java.time.LocalDate;

public class AppointmentDTO {
    private int idAppointment;
    private LocalDate date;

    private Client client;

    private Psychologist psychologist;

    private AppointmentStatus appointmentStatus;

    //getters and setters

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
        return appointmentStatus;
    }

    public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }
}
