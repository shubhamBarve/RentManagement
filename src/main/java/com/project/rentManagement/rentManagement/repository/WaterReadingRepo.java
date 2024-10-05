package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.WaterReadings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface WaterReadingRepo extends JpaRepository<WaterReadings,Integer> {
    @Query("SELECT w FROM WaterReadings w WHERE w.reading_date BETWEEN :startOfLastMonth AND :endOfLastMonth  AND w.roomID=:roomID")
    WaterReadings findByReadingDate(@Param("startOfLastMonth") LocalDate startOfLastMonth,@Param("endOfLastMonth") LocalDate endOfLastMonth,@Param("roomID") int roomid);
}
