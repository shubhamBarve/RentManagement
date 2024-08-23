package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepo extends JpaRepository<Invoice,Integer> {
}
