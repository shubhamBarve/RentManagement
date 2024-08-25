package com.project.rentManagement.rentManagement.controller;


import com.project.rentManagement.rentManagement.DTO.TenantDto;
import com.project.rentManagement.rentManagement.model.Tenant;
import com.project.rentManagement.rentManagement.service.TenantService;
import com.project.rentManagement.rentManagement.validator.TenantValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tenant/")
public class TenantController {

    @Autowired
    TenantService tenantService;


    @PostMapping("addTenant")
    public Tenant addTenant(@RequestBody TenantDto tenants){
        //Tenants tenants1 = tenants;

       // TenantValidator.validTenant(tenants);

        return null;
    }

}
