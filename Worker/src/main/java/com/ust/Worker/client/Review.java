package com.ust.Worker.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    private String reviewId;
    private String agencyId;
    private String agentId;
    private String workerId;
    private String feedback;
    private int rating;
}
