package com.ust.Worker.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "worker")
public class Worker {

    private String workerId;
    private String workerName;
    private String workerSkill;
    private double dailyWageRate;
    private String agentId;
}
