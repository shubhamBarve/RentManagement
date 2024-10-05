package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.ElectricityReadings;
import com.project.rentManagement.rentManagement.model.WaterReadings;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ElectricityRepo extends JpaRepository<ElectricityReadings, Integer> {


    @Query("SELECT w.reading_value FROM ElectricityReadings w WHERE w.reading_date BETWEEN :startOfLastMonth AND :endOfLastMonth AND w.roomID=:roomID")
    Integer findByReadingDate(@Param("startOfLastMonth") LocalDate startOfLastMonth, @Param("endOfLastMonth") LocalDate endOfLastMonth,@Param("roomID") int roomid);

    @Query("select w.reading_value from ElectricityReadings w where w.reading_date between :startcurrentMonth  and :endofcurrentMonth AND w.roomID=:roomID")
    Integer findCurrentReadingValue (@Param("startcurrentMonth") LocalDate startcurrentMonth,@Param("endofcurrentMonth") LocalDate endofcurrentMonth,@Param("roomID") int roomid);

}
