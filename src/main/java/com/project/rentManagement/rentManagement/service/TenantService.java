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
    public Tenant addTenant(TenantDto tenants){

        ModelMapper modelMapper = new ModelMapper();
        //Tenant tenants1 = modelMapper.map(tenants,Tenants.class);
       // System.out.println( tenantRepo.findRoomIdByTenantId(8));
        return null;
     //return tenantRepo.save(tenants1);
    }

}
