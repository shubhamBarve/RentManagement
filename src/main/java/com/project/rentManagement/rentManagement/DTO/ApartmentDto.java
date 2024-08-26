package com.project.rentManagement.rentManagement.DTO;

import com.project.rentManagement.rentManagement.model.Owner;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ApartmentDto {
    private Integer apartmentID;

    private String apartmentNumber;

    private String address;
    private String apartmentname;

    @Override
    public String toString() {
        return "ApartmentDto{" +
                "apartmentID=" + apartmentID +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", address='" + address + '\'' +
                ", apartmentname='" + apartmentname + '\'' +
                ", owner=" + owner +
                '}';
    }

    public String getApartmentname() {
        return apartmentname;
    }

    public void setApartmentname(String apartmentname) {
        this.apartmentname = apartmentname;
    }

    private Owner owner;

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

}
