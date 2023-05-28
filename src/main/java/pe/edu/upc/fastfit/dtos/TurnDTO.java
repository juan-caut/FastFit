package pe.edu.upc.fastfit.dtos;

import java.time.LocalDate;

public class TurnDTO {

    private int idTurn;
    private LocalDate date;
    private int duration;
    private int TurnStatus_id;
    private int Psychologist_id;

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

    public int getTurnStatus_id() {
        return TurnStatus_id;
    }

    public void setTurnStatus_id(int turnStatus_id) {
        TurnStatus_id = turnStatus_id;
    }

    public int getPsychologist_id() {
        return Psychologist_id;
    }

    public void setPsychologist_id(int psychologist_id) {
        Psychologist_id = psychologist_id;
    }
}
