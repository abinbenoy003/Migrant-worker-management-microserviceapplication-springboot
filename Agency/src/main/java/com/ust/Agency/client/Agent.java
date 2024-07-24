package com.ust.Agency.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agent {


    public String agentId;
    public String agentName;
    public int agentPhone;
    public String agencyId;
}