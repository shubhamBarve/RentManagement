package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "ElectricityReadings")
public class ElectricityReadings {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer id;

        @Column
        int roomID;

        @Column
        java.sql.Date reading_date;

        @Column
        int reading_value;
}
