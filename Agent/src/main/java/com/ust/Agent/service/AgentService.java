package com.ust.Agent.service;

import com.ust.Agent.client.Review;
import com.ust.Agent.client.Worker;
import com.ust.Agent.feign.ReviewClient;
import com.ust.Agent.feign.WorkerClient;
import com.ust.Agent.model.Agent;
import com.ust.Agent.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private WorkerClient workerClient;

    @Autowired
    private ReviewClient reviewClient;

    public List<Agent> getAllAgents() {
        return agentRepository.findAll();
    }

    public Agent createAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    public Agent getAgentById(String id) {
        return agentRepository.findById(id).orElse(null);
    }

    public List<Worker> getWorkersByAgentId(String agentId){
        return workerClient.getAllWorkers().stream()
                .filter(worker-> worker.getAgentId().equalsIgnoreCase(agentId))
                .toList();
    }

    public List<Review> getReviewsByAgentId(String agentId) {
        return reviewClient.getAllReviews().stream()
                .filter(review -> review.getAgentId().equalsIgnoreCase(agentId))
                .toList();
    }
}
