package com.ust.Agency.Service;

import com.ust.Agency.client.Agent;
import com.ust.Agency.client.Review;
import com.ust.Agency.feign.AgentClient;
import com.ust.Agency.feign.ReviewClient;
import com.ust.Agency.model.Agency;
import com.ust.Agency.repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyService {

    @Autowired
    private AgencyRepository agencyRepository;

    @Autowired
    private AgentClient agentClient;

    @Autowired
    private ReviewClient reviewClient;

    public Agency addAgency(Agency agency) {
        return agencyRepository.save(agency);
    }


    public List<Agency> getAllAgencies() {
        return agencyRepository.findAll();
    }

    public Agency getAgencyById(String agencyId) {
        return agencyRepository.findById(agencyId).orElse(null);
    }

    public List<Agent> getAgentsByAgencyId(String agencyId) {
        return agentClient.getAllAgents().stream()
                .filter(agency-> agency.getAgencyId().equalsIgnoreCase(agencyId))
                .toList();
    }

    public List<Review> getReviewsByAgencyId(String agencyId) {
        return reviewClient.getAllReviews().stream()
                .filter(review -> review.getAgencyId().equalsIgnoreCase(agencyId))
                .toList();
    }
}
