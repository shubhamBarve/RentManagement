package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "RentPayment")
public class RentPayment {

    @Id
    int id;

    @Column
    int tenant_id;

    @Column
    int room_id;

    @Column
    Date payment_date;

    @Column
    int base_rent;

    @Column
    int electricity_cost;

    @Column
    int water_cost;

    @Column
    int total_amount;



}
