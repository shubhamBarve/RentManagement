package com.project.rentManagement.rentManagement.controller;


import com.project.rentManagement.rentManagement.DTO.BasicResponse;
import com.project.rentManagement.rentManagement.model.ElectricityReadings;
import com.project.rentManagement.rentManagement.model.Tenant;
import com.project.rentManagement.rentManagement.model.WaterReadings;
import com.project.rentManagement.rentManagement.repository.ElectricityRepo;
import com.project.rentManagement.rentManagement.repository.WaterReadingRepo;
import com.project.rentManagement.rentManagement.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.YearMonth;

@RestController
@RequestMapping("tenant/")
public class TenantController {

    @Autowired
    TenantService tenantService;
    @Autowired
    WaterReadingRepo waterReadingsReadingRepo;
    @Autowired
    ElectricityRepo electricityRepo;

    @PostMapping("addTenant")
    public Tenant addTenant(@RequestBody Tenant tenants){
        //Tenants tenants1 = tenants;
        tenantService.addTenant(tenants);
       // TenantValidator.validTenant(tenants);

        return null;
    }
    @PostMapping("/addWater")
    public BasicResponse addWaterUnits(@RequestBody WaterReadings waterReadings){

        System.out.println(waterReadings);
        System.out.println(getReadingForLastMonth());
       // waterReadingsReadingRepo.save(waterReadings);



return  null;
    }

    @PostMapping("/addElectricity")
    public ResponseEntity<BasicResponse> addElectricity(@RequestBody ElectricityReadings electricityReadings){


        System.out.println(electricityReadings);
        //System.out.println(getReadingForLastMonth());
        electricityRepo.save(electricityReadings);
        return null;
    }

    public WaterReadings getReadingForLastMonth() {
        LocalDate startOfLastMonth = YearMonth.now().minusMonths(1).atDay(1);
        System.out.println(startOfLastMonth+" asdal");
       // LocalDate endOfLastMonth = DateUtils.getEndOfLastMonth();

        // Assuming there's only one entry per month, fetching the entry for the start of the month
        return waterReadingsReadingRepo.findByReadingDate(startOfLastMonth);
    }
}
