package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "ElectricityReadings")
public class ElectricityReadings {
        @Id
        int id;

        @Column
        int room_id;

        @Column
        Date reading_date;

        @Column
        int reading_value;
}
