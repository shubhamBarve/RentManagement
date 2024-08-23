package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.ElectricityReadings;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectricityRepo extends JpaRepository<ElectricityReadings, Integer> {
}
