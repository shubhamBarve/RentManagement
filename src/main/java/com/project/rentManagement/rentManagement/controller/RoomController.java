package com.project.rentManagement.rentManagement.controller;

import com.project.rentManagement.rentManagement.model.Room;
import com.project.rentManagement.rentManagement.validator.RoomValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    RoomValidator  roomValidator;
    @PostMapping("/addRoom")
    public String addRoom(@RequestBody Room room){

        roomValidator.validateRoome(room);
        return "";
    }

}
