package com.project.rentManagement.rentManagement.controller;


import com.project.rentManagement.rentManagement.DTO.OwnerDto;
import com.project.rentManagement.rentManagement.model.Owner;
import com.project.rentManagement.rentManagement.validator.OwnerValidator;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("owner")
public class OwnerController {

    @Autowired
    OwnerValidator ownerValidator;

    @PostMapping("/addOwner")
    public String addOwner(@RequestBody OwnerDto ownerDto){

        System.out.println("OwnerDto" +ownerDto);

            ownerValidator.validateOwner(ownerDto);

            return "";

    }



}
