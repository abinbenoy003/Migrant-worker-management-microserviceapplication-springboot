package com.ust.Agency.feign;

import com.ust.Agency.client.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="review", url="http://localhost:2009/review")
public interface ReviewClient {

    @GetMapping("/allReviews")
    public List<Review> getAllReviews();
}