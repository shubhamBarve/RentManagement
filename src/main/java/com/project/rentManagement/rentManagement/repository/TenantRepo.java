package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TenantRepo extends JpaRepository<Tenant,Integer> {

}
