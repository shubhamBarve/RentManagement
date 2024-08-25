package com.project.rentManagement.rentManagement.validator;


import com.project.rentManagement.rentManagement.DTO.TenantDto;
import com.project.rentManagement.rentManagement.repository.TenantRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TenantValidator {
    @Autowired
   static TenantRepo tenantRepo;

    

    public static TenantDto createTenant(TenantDto tenantDto){
        String name = tenantDto.getName();
        return  null;

    }
}
