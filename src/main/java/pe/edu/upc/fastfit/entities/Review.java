package pe.edu.upc.fastfit.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idReview;
    @Column(name="content", length = 500,nullable = false)
    private String content;
    @Column(name="date",nullable = false)
    private LocalDate date;
    @Column(name="likes",nullable = false)
    private int likes;
    @ManyToOne
    @JoinColumn(name = "idClient",nullable = false)
    private Client client;
    @ManyToOne
    @JoinColumn(name = "idPsi",nullable = false)
    private Psychologist psychologist;


    public Review(){
    }

    public Review(int idReview, String content, LocalDate date, int likes, Client client, Psychologist psychologist) {
        this.idReview = idReview;
        this.content = content;
        this.date = date;
        this.likes = likes;
        this.client = client;
        this.psychologist = psychologist;
    }

    public int getIdReview() {
        return idReview;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
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
}
