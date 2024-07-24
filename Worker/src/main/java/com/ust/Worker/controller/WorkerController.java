package com.ust.Worker.controller;

import com.ust.Worker.client.Review;
import com.ust.Worker.model.Worker;
import com.ust.Worker.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @PostMapping("/addworker")
    public Worker addWorker(Worker worker) {
        return workerService.addWorker(worker);
    }

    @GetMapping("/workers")
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }

    @GetMapping("/getworker/{workerId}")
    public Worker getWorkerById(String workerId){
        return workerService.getWorkerById(workerId);
    }

    @GetMapping("/getReviews/{workerId}")
    public List<Review> getReviewsById(@PathVariable String workerId){
        return workerService.getReviewsByWorkerId(workerId);

    }
}
