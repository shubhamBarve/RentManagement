package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.RentPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentPaymentRepo extends JpaRepository<RentPayment,Integer> {
}
