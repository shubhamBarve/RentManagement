package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class Rooms {
    @Id
    int id;

    @Column
    String room_number;

    public enum RoomType {
        Single,
        Double;

    }
    @Column
    RoomType room_type;

    @Column
    int base_rent;


    Data last_rent_update;
}
