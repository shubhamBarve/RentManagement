package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Invoices")
public class Invoice {

    @Id
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
    int water_cost;

    @Column
    int total_amount;
}