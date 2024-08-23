package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.Date;

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
