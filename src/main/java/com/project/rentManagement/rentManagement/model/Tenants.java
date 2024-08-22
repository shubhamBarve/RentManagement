package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tenants {
    @Id
    public int id;



}
