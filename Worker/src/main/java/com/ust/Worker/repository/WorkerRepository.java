package com.ust.Worker.repository;

import com.ust.Worker.model.Worker;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends MongoRepository<Worker,String> {
}
