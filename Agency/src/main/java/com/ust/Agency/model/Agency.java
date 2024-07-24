package com.ust.Agency.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Agency {
    @Id
    public String agencyId;
    public String agencyName;
    public String agencyAddress;
    public Long agencyContact;
}
