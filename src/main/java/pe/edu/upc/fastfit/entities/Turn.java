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
    @Column(name = "status",nullable = false)
    private String status;
    @ManyToOne
    @JoinColumn(name = "idPsi",nullable = false)
    private Psychologist psychologist;

    public Turn(){
    }

    public Turn(int idTurn, LocalDate date, int duration, String status, Psychologist psychologist) {
        this.idTurn = idTurn;
        this.date = date;
        this.duration = duration;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Psychologist getPsychologist() {
        return psychologist;
    }

    public void setPsychologist(Psychologist psychologist) {
        this.psychologist = psychologist;
    }
}
