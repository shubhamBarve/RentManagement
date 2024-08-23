package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.WaterReadings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterReadingRepo extends JpaRepository<WaterReadings,Integer> {
}
