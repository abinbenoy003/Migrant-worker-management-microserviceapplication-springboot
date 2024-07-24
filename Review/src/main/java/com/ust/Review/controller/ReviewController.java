package com.ust.Review.controller;

import com.ust.Review.model.Review;
import com.ust.Review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/allReviews")
    public List<Review> getAllReviews(){
        return reviewService.getAllReviews();
    }
    @PostMapping("/addReview")
    public Review addReview(@RequestBody Review review){
        return reviewService.createReview(review);
    }

}
