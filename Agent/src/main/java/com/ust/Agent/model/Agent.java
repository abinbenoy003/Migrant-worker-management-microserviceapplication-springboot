package com.ust.Agent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="agent")
public class Agent {

    @Id
    public String agentId;
    public String agentName;
    public int agentPhone;
    public String agencyId;

}
