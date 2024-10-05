package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "Invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    int tenant_id;

    @Column
    Date invoice_date;

    @Column
    int base_rent;

    @Column
    int electricity_cost;

    @Column
    int roomID;

    @Column
    int water_cost;

    @Column
    int total_amount;

    public int getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(int tenant_id) {
        this.tenant_id = tenant_id;
    }

    public Date getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(Date invoice_date) {
        this.invoice_date = invoice_date;
    }

    public int getBase_rent() {
        return base_rent;
    }

    public void setBase_rent(int base_rent) {
        this.base_rent = base_rent;
    }

    public int getElectricity_cost() {
        return electricity_cost;
    }

    public void setElectricity_cost(int electricity_cost) {
        this.electricity_cost = electricity_cost;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getWater_cost() {
        return water_cost;
    }

    public void setWater_cost(int water_cost) {
        this.water_cost = water_cost;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }
}
