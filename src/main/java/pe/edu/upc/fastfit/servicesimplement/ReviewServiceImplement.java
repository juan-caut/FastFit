package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fastfit.dtos.ReviewpsyDTO;
import pe.edu.upc.fastfit.entities.Review;
import pe.edu.upc.fastfit.repositories.IReviewRepository;
import pe.edu.upc.fastfit.services.IReviewService;

import java.util.ArrayList;
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


    @Override
    public List<ReviewpsyDTO> byPsi() {
        List<String[]> reviewBypsi = rR.byPsi();
        List<ReviewpsyDTO> ReviewpsyDTOs = new ArrayList<>();

        for (String[] data : reviewBypsi) {
            ReviewpsyDTO dto = new ReviewpsyDTO();

            dto.setNames(data[0]);
            dto.setAvg(Double.parseDouble(data[1]));
            dto.setSum(Integer.parseInt(data[2]));
            dto.setMax(Integer.parseInt(data[3]));
            dto.setMin(Integer.parseInt(data[4]));

            ReviewpsyDTOs.add(dto);
        }

        return ReviewpsyDTOs;
    }
    /*



    * */


}
