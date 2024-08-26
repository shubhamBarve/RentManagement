package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Apartments")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer apartmentID;

    @Column(name = "ApartmentNumber", nullable = false)
    private String apartmentNumber;

    @Column(name = "Address")
    private String address;

    @Column(name = "apartmentname", nullable = false)
    private String apartmentname;

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentID=" + apartmentID +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", address='" + address + '\'' +
                ", apartmentname='" + apartmentname + '\'' +
                ", owner=" + owner +
                ", rooms=" + rooms +
                '}';
    }

    public String getApartmentname() {
        return apartmentname;
    }

    public void setApartmentname(String apartmentname) {
        this.apartmentname = apartmentname;
    }

    @ManyToOne
    @JoinColumn(name = "OwnerID", nullable = false)
    private Owner owner;

    @OneToMany(mappedBy = "apartment")
    private Set<Room> rooms;

    // Getters and setters
    public Integer getApartmentID() {
        return apartmentID;
    }

    public void setApartmentID(Integer apartmentID) {
        this.apartmentID = apartmentID;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }
}
