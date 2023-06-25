package pe.edu.upc.fastfit.services;

import pe.edu.upc.fastfit.dtos.ReviewpsyDTO;
import pe.edu.upc.fastfit.entities.Review;

import java.util.List;

public interface IReviewService {
    public void insert(Review review);
    List<Review> list();
    public void delete(int idReview);
    public Review listId(int idReview);
    List<ReviewpsyDTO> byPsi();
}
