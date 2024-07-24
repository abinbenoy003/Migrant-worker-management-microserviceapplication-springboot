package com.ust.Review.service;

import com.ust.Review.model.Review;
import com.ust.Review.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;


    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }
}
