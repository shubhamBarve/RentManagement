package com.project.rentManagement.rentManagement.controller;


import com.project.rentManagement.rentManagement.DTO.BasicResponse;
import com.project.rentManagement.rentManagement.model.ElectricityReadings;
import com.project.rentManagement.rentManagement.model.Invoice;
import com.project.rentManagement.rentManagement.model.Tenant;
import com.project.rentManagement.rentManagement.model.WaterReadings;
import com.project.rentManagement.rentManagement.repository.ElectricityRepo;
import com.project.rentManagement.rentManagement.repository.RoomsRepo;
import com.project.rentManagement.rentManagement.repository.TenantRepo;
import com.project.rentManagement.rentManagement.repository.WaterReadingRepo;
import com.project.rentManagement.rentManagement.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("tenant/")
public class TenantController {

    @Autowired
    TenantService tenantService;
    @Autowired
    WaterReadingRepo waterReadingsReadingRepo;
    @Autowired
    ElectricityRepo electricityRepo;
    @Autowired
    RoomsRepo roomsRepo;
    @Autowired
    TenantRepo tenantRepo;


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
        int roomId= waterReadings.getRoomID();
        System.out.println(getReadingForLastMonthWater(roomId));
       // waterReadingsReadingRepo.save(waterReadings);



return  null;
    }

    @PostMapping("/addElectricity")
    public ResponseEntity<BasicResponse> addElectricity(@RequestBody ElectricityReadings electricityReadings){


        System.out.println(electricityReadings);
        int roomId =electricityReadings.getRoomID();
        //System.out.println(getReadingForLastMonthElectricity(roomId));

        electricityRepo.save(electricityReadings);
        return null;
    }

    @PostMapping("/addInvoice")
    public ResponseEntity<BasicResponse> addInvoice(@RequestParam int roomId,@RequestParam int valuePerUnit,@RequestParam int waterCost){

        System.out.println("RoomId"+roomId);

        Double roomRent = roomsRepo.findRoomRent(roomId);

        System.out.println("Room Rent"+roomRent);

        int currentReading = getCurrentMonthElectricityreading(roomId);
        System.out.println("CurrentMonthReading"+currentReading);
        int lastMonthReading = getReadingForLastMonthElectricity(roomId);
        System.out.println("LastMonthReading"+lastMonthReading);

        int electricityCost = Math.abs(currentReading-lastMonthReading)*valuePerUnit;
        System.out.println("TotalCost "+Math.abs(electricityCost));

        int totalCost = (int) (roomRent+electricityCost+waterCost);
        System.out.println("total amount -> "+totalCost);

        int tenantID = tenantRepo.getTenantIDfromRoomID(roomId);

        System.out.println("Tenant ID "+tenantID);

        //Create the Invoice
        Invoice invoice=new Invoice();
        System.out.println(getCurrentDate());
            invoice.setInvoice_date(getCurrentDate());

        return null;
    }

    public int getCurrentMonthElectricityreading(int roomId){
        LocalDate startcurrenMonth = YearMonth.now().atDay(1);
        System.out.println("startMonth"+startcurrenMonth);
        LocalDate endofCurrentMonth = YearMonth.now().atEndOfMonth();
       return electricityRepo.findCurrentReadingValue(startcurrenMonth,endofCurrentMonth,roomId);
    }

    public WaterReadings getReadingForLastMonthWater(int  roomId) {
        LocalDate startOfLastMonth = YearMonth.now().minusMonths(1).atDay(1);
        System.out.println(startOfLastMonth+" asdal");
        LocalDate endOfLastMonth =YearMonth.now().minusMonths(1).atEndOfMonth();

        // Assuming there's only one entry per month, fetching the entry for the start of the month
        return waterReadingsReadingRepo.findByReadingDate(startOfLastMonth,endOfLastMonth,roomId);
    }
    public int getReadingForLastMonthElectricity(int  roomId) {
        LocalDate startOfLastMonth = YearMonth.now().minusMonths(1).atDay(1);
        //System.out.println(startOfLastMonth+" <= Last month");
        LocalDate endOfLastMonth =YearMonth.now().minusMonths(1).atEndOfMonth();

        // Assuming there's only one entry per month, fetching the entry for the start of the month
        return electricityRepo.findByReadingDate(startOfLastMonth,endOfLastMonth,roomId);
    }
    public Date getCurrentDate(){
        Date date;
        date = new Date();

        return date;
    }
}
