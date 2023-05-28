package pe.edu.upc.fastfit.dtos;

import java.time.LocalDate;

public class ReviewDTO {
    private int idReview;
    private String content;
    private LocalDate date;
    private int likes;
    private int Client_id;
    private int Psychologist_id;

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
