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
    @ManyToOne
    @JoinColumn(name = "idTurnstatus",nullable = false)
    private TurnStatus turnstatus;
    @ManyToOne
    @JoinColumn(name = "idPsi",nullable = false)
    private Psychologist psychologist;

    public Turn(){
    }

    public Turn(int idTurn, LocalDate date, int duration, TurnStatus turnstatus, Psychologist psychologist) {
        this.idTurn = idTurn;
        this.date = date;
        this.duration = duration;
        this.turnstatus = turnstatus;
        this.psychologist = psychologist;
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
