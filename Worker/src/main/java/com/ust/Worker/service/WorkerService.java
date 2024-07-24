package com.ust.Worker.service;

import com.ust.Worker.client.Review;
import com.ust.Worker.feign.ReviewClient;
import com.ust.Worker.model.Worker;
import com.ust.Worker.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private ReviewClient reviewClient;


    public Worker addWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    public Worker getWorkerById(String workerId) {
        return workerRepository.findById(workerId).orElse(null);
    }

    public List<Review> getReviewsByWorkerId(String workerId) {
        return reviewClient.getAllReviews().stream()
                .filter(review->review.getWorkerId().equals(workerId))
                .toList();
    }
}
