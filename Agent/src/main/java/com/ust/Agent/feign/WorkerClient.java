package com.ust.Agent.feign;


import com.ust.Agent.client.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="worker",url="http://localhost:2008/worker")
public interface WorkerClient {
    @GetMapping("/workers")
    public List<Worker> getAllWorkers();
}
