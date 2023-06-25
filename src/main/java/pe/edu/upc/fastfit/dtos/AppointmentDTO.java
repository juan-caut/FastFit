package pe.edu.upc.fastfit.dtos;

import pe.edu.upc.fastfit.entities.AppointmentStatus;
import pe.edu.upc.fastfit.entities.Client;
import pe.edu.upc.fastfit.entities.Psychologist;
import pe.edu.upc.fastfit.entities.Turn;

import java.time.LocalDate;

public class AppointmentDTO {
    private int idAppointment;

    private Client client;

    private AppointmentStatus appointmentStatus;
    private Turn turn;
    //getters and setters

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


    public AppointmentStatus getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public Turn getTurn() {
        return turn;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }
}
