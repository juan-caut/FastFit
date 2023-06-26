package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fastfit.dtos.ReviewDTO;
import pe.edu.upc.fastfit.dtos.ReviewpsyDTO;
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
    @PreAuthorize("hasAnyAuthority('USER')")
    public void insert(@RequestBody ReviewDTO dto) {
        ModelMapper m = new ModelMapper();
        Review p = m.map(dto, Review.class);
        revS.insert(p);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN','USER','PSICO')")
    public List<ReviewDTO> list() {
        return revS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReviewDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('USER')")
    public void delete(@PathVariable("id") Integer id) {
        revS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','USER','PSICO')")
    public ReviewDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ReviewDTO dto=m.map(revS.listId(id),ReviewDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('USER')")
    public void update(@RequestBody ReviewDTO dto) {
        ModelMapper m = new ModelMapper();
        Review p = m.map(dto, Review.class);
        revS.insert(p);
    }
    @GetMapping("/bypsi")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<ReviewpsyDTO> bypsi() {
        List<ReviewpsyDTO> ReviewpsyDTOs = revS.byPsi();
        return ReviewpsyDTOs;
    }

}
