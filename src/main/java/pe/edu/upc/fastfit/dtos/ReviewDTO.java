package pe.edu.upc.fastfit.dtos;

import pe.edu.upc.fastfit.entities.Client;
import pe.edu.upc.fastfit.entities.Psychologist;

import java.time.LocalDate;

public class ReviewDTO {
    private int idReview;
    private String content;
    private LocalDate date;
    private int likes;
    private Client client;
    private Psychologist psychologist;

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
