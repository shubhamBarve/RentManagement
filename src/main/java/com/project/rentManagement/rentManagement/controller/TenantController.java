package com.project.rentManagement.rentManagement.controller;

import com.project.rentManagement.rentManagement.model.Tenants;
import com.project.rentManagement.rentManagement.service.TenantService;
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

    @PostMapping("addTenant/")
    public Tenants addTenant(@RequestBody Tenants tenants){
        return tenantService.addTenant(tenants);
    }

}
