package pe.edu.upc.fastfit.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class AppointmentDTO {
    private int idAppointment;
    private LocalDate date;
    private int Client_id;

    private int Psychologist_id;

    private int AppointmentStatus_id;

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
