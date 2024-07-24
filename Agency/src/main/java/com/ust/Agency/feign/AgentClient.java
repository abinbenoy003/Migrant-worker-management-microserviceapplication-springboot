package com.ust.Agency.feign;

import com.ust.Agency.client.Agent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="Agent", url="http://localhost:9101/agent")
public interface AgentClient {

        @GetMapping("/agents")
        public List<Agent> getAllAgents();
    }

