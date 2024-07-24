package com.ust.Agent.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker {

    private String workerId;
    private String workerName;
    private String workerSkill;
    private double dailyWageRate;
    private String agentId;
}
