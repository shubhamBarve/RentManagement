package com.project.rentManagement.rentManagement.service;

import com.project.rentManagement.rentManagement.DTO.TenantDto;
import com.project.rentManagement.rentManagement.model.Tenant;
import com.project.rentManagement.rentManagement.repository.TenantRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class TenantService {

    @Autowired
    TenantRepo tenantRepo;
    public Tenant addTenant(Tenant tenants){

        System.out.println(tenants);

     return tenantRepo.save(tenants);
    }

}
