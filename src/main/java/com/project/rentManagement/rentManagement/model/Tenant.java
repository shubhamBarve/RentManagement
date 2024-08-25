package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tenants")
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tenantID;

    @Column(name = "TenantName", nullable = false)
    private String tenantName;

    @Column(name = "ContactInfo")
    private String contactInfo;

    @ManyToOne
    @JoinColumn(name = "RoomID", nullable = false)
    private Room room;

    @Column(name = "MoveInDate")
    private java.sql.Date moveInDate;

    @Column(name = "MoveOutDate")
    private java.sql.Date moveOutDate;

    // Getters and setters
    public Integer getTenantID() {
        return tenantID;
    }

    public void setTenantID(Integer tenantID) {
        this.tenantID = tenantID;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public java.sql.Date getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(java.sql.Date moveInDate) {
        this.moveInDate = moveInDate;
    }

    public java.sql.Date getMoveOutDate() {
        return moveOutDate;
    }

    public void setMoveOutDate(java.sql.Date moveOutDate) {
        this.moveOutDate = moveOutDate;
    }
}