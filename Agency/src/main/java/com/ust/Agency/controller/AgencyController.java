package com.ust.Agency.controller;


import com.ust.Agency.Service.AgencyService;
import com.ust.Agency.client.Agent;
import com.ust.Agency.client.Review;
import com.ust.Agency.model.Agency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agency")
public class AgencyController {

    @Autowired
    private AgencyService agencyService;

    @PostMapping("/addagency")
    public ResponseEntity<Agency> addAgency(@RequestBody Agency agency){
        Agency newAgency = agencyService.addAgency(agency);
        return new ResponseEntity<>(newAgency, HttpStatus.CREATED);
    }

    @GetMapping("/allAgencies")
    public ResponseEntity<List<Agency>> getAllAgencies(){
        List<Agency> agencies = agencyService.getAllAgencies();
        return new ResponseEntity<>(agencies, HttpStatus.OK);
    }

    @GetMapping("/getAgency/{agencyId}")
    public ResponseEntity<Agency> getAgencyById(@PathVariable String agencyId){
        Agency agency = agencyService.getAgencyById(agencyId);
        return new ResponseEntity<>(agency, HttpStatus.OK);
    }

    @GetMapping("/getAgents/{agencyId}")
    public ResponseEntity<List<Agent>> getAgentsByAgencyId(@PathVariable String agencyId){
        List<Agent> agents = agencyService.getAgentsByAgencyId(agencyId);
        return new ResponseEntity<>(agents, HttpStatus.OK);
    }

    @GetMapping("/getReviews/{agencyId}")
    public ResponseEntity<List<Review>> getReviewsByAgencyId(@PathVariable String agencyId){
        List<Review> reviews = agencyService.getReviewsByAgencyId(agencyId);
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }

}
