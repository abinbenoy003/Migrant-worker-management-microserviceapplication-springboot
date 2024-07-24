package com.ust.Agent.controller;

import com.ust.Agent.client.Review;
import com.ust.Agent.client.Worker;
import com.ust.Agent.model.Agent;
import com.ust.Agent.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @GetMapping("/agents")
    public List<Agent> getAllAgents(){
        return agentService.getAllAgents();
    }

    @PostMapping("/addagent")
    public Agent createAgent(@RequestBody Agent agent){
        return agentService.createAgent(agent);


    }

    @GetMapping("/agent/{agentId}")
    public Agent getAgentById(String id){
        return agentService.getAgentById(id);
    }

    @GetMapping("/getWorkers/{agentId}")
    public ResponseEntity<List<Worker>> getWorkersByAgentId(String agentId){
        List<Worker> workers=agentService.getWorkersByAgentId(agentId);
        return new ResponseEntity<>(workers, HttpStatus.OK);
    }

    @GetMapping("/getReviews/{agentId}")
    public ResponseEntity<List<Review>> getReviewsByAgentId(String agentId){
        List<Review> reviews=agentService.getReviewsByAgentId(agentId);
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }
}
