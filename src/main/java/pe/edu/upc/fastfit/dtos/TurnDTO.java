package pe.edu.upc.fastfit.dtos;

import pe.edu.upc.fastfit.entities.Psychologist;
import pe.edu.upc.fastfit.entities.TurnStatus;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class TurnDTO {

    private int idTurn;
    private LocalDate date;
    private int duration;
    private TurnStatus turnstatus;
    private Psychologist psychologist;

    public int getIdTurn() {
        return idTurn;
    }

    public void setIdTurn(int idTurn) {
        this.idTurn = idTurn;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public TurnStatus getTurnstatus() {
        return turnstatus;
    }

    public void setTurnstatus(TurnStatus turnstatus) {
        this.turnstatus = turnstatus;
    }

    public Psychologist getPsychologist() {
        return psychologist;
    }

    public void setPsychologist(Psychologist psychologist) {
        this.psychologist = psychologist;
    }
}
