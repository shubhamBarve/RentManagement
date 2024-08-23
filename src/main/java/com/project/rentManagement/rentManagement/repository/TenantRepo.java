package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.Tenants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepo extends JpaRepository<Tenants,Integer> {
}
