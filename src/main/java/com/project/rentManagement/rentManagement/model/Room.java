package com.project.rentManagement.rentManagement.model;

import com.project.rentManagement.rentManagement.DTO.RoomStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "Rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomID;

    @Column(name = "RoomNumber", nullable = false)
    private String roomNumber;

    @Column(name = "Rent")
    private Double rent;


    @ManyToOne
    @JoinColumn(name = "ApartmentID", nullable = false)
    private Apartment apartment;

    @OneToOne(mappedBy = "room")
    private Tenant tenant;

    // Getters and setters
    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }



    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Tenant getTenant() {
        return tenant;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", roomNumber='" + roomNumber + '\'' +
                ", rent=" + rent +
                ", apartment=" + apartment +
                ", tenant=" + tenant +
                '}';
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}