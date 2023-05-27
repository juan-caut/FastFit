package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.entities.Review;
import pe.edu.upc.fastfit.repositories.IReviewRepository;
import pe.edu.upc.fastfit.services.IReviewService;

import java.util.List;

@Service
public class ReviewServiceImplement implements IReviewService{

    @Autowired
    private IReviewRepository rR;

    @Override
    public void insert(Review review) {
        rR.save(review);
    }

    @Override
    public List<Review> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idReview) {
        rR.deleteById(idReview);
    }

    @Override
    public Review listId(int idReview) {
        return rR.findById(idReview).orElse(new Review());
    }
}
