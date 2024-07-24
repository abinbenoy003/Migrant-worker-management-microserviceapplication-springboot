package com.ust.Review.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="review")
public class Review {

    private String reviewId;
    private String agencyId;
    private String agentId;
    private String workerId;
    private String feedback;
    private int rating;
}
