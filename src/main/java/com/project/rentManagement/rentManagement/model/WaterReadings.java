package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "WaterReadings")
public class WaterReadings {
    @Id
    private int id;

    @Column
    private int roomID;

    @Column
    private java.sql.Date reading_date;

    @Column
    private int reading_value;


}
