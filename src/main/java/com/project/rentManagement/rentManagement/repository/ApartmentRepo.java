package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepo extends JpaRepository<Apartment,Integer> {


}
