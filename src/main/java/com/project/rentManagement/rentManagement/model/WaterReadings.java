package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class WaterReadings {
    @Id
    int id;

    @Column
    int room_id;

    @Column
    Date reading_date;

    @Column
    int reading_value;


}
