package com.project.rentManagement.rentManagement.controller;

import com.project.rentManagement.rentManagement.DTO.ApartmentDto;
import com.project.rentManagement.rentManagement.model.Apartment;
import com.project.rentManagement.rentManagement.validator.ApatmentValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apartment")
public class ApartmentController {
    @Autowired
    ApatmentValidator apatmentValidator;
    @PostMapping("/addApartment")
    public String addApartment(@RequestBody ApartmentDto apartmentDto){

        apatmentValidator.validateApartment(apartmentDto);
        return "";
    }
}
