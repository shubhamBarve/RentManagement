package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public Date getReading_date() {
        return reading_date;
    }

    public void setReading_date(Date reading_date) {
        this.reading_date = reading_date;
    }

    public int getReading_value() {
        return reading_value;
    }

    public void setReading_value(int reading_value) {
        this.reading_value = reading_value;
    }
}
