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
    @Column(name="Client_id",nullable = false)
    private int Client_id;
    @Column(name="Psychologist_id",nullable = false)
    private int Psychologist_id;

    public Review(){

    }
    public Review(int idReview, String content, LocalDate date, int likes, int client_id, int psychologist_id) {
        this.idReview = idReview;
        this.content = content;
        this.date = date;
        this.likes = likes;
        Client_id = client_id;
        Psychologist_id = psychologist_id;
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
}
