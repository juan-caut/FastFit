package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.ReviewDTO;
import pe.edu.upc.fastfit.entities.Review;
import pe.edu.upc.fastfit.services.IReviewService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private IReviewService revS;

    @PostMapping
    public void insert(@RequestBody ReviewDTO dto) {
        ModelMapper m = new ModelMapper();
        Review p = m.map(dto, Review.class);
        revS.insert(p);
    }

    @GetMapping
    public List<ReviewDTO> list() {
        return revS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReviewDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        revS.delete(id);
    }

    @GetMapping("/{id}")
    public ReviewDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ReviewDTO dto=m.map(revS.listId(id),ReviewDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody ReviewDTO dto) {
        ModelMapper m = new ModelMapper();
        Review p = m.map(dto, Review.class);
        revS.insert(p);
    }
}
