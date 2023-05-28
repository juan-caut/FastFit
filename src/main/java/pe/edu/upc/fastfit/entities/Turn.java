package pe.edu.upc.fastfit.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "turns")
public class Turn {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTurn;
    @Column(name="date",nullable = false)
    private LocalDate date;
    @Column(name="duration",nullable = false)
    private int duration;
    @Column(name="TurnStatus_id",nullable = false)
    private int TurnStatus_id;
    @Column(name="Psychologist_id",nullable = false)
    private int Psychologist_id;

    public Turn(){
    }
    public Turn(int idTurn, LocalDate date, int duration, int turnStatus_id, int psychologist_id) {
        this.idTurn = idTurn;
        this.date = date;
        this.duration = duration;
        TurnStatus_id = turnStatus_id;
        Psychologist_id = psychologist_id;
    }

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
