package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
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
    @Enumerated(EnumType.STRING)
    @Column
    RoomType room_type;

    @Column
    int base_rent;

    @Column
    Date last_rent_update;
}
