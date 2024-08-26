package com.project.rentManagement.rentManagement.validator;

import com.project.rentManagement.rentManagement.model.Room;
import com.project.rentManagement.rentManagement.repository.ApartmentRepo;
import com.project.rentManagement.rentManagement.repository.RoomsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoomValidator {

    @Autowired
    RoomsRepo roomsRepo;

    @Autowired
        ApartmentRepo apartmentRepo;

    public Room validateRoome(Room room){

        System.out.println(room);
      return roomsRepo.save(room);
    }
}
