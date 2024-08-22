package com.project.rentManagement.rentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("healthCheck")
public class HealthCheckController {


    @GetMapping
    public  String healthCheck(){
        return "Health IS ok";

    }

}
