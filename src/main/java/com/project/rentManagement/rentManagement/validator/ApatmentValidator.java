package com.project.rentManagement.rentManagement.validator;

import com.project.rentManagement.rentManagement.DTO.ApartmentDto;
import com.project.rentManagement.rentManagement.model.Apartment;
import com.project.rentManagement.rentManagement.repository.ApartmentRepo;
import com.project.rentManagement.rentManagement.repository.OwnerRepo;
import jakarta.persistence.Column;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApatmentValidator {

    @Autowired
    ApartmentRepo  apartmentRepo;
    @Autowired
    OwnerRepo ownerRepo;
    public Apartment validateApartment(ApartmentDto apartmentDto){
        Apartment apartment1;


        int ownerId = apartmentDto.getOwner().getOwnerID();
        System.out.println(ownerId);

       boolean isOwnerexist= ownerRepo.existsByownerID(ownerId);
        System.out.println(isOwnerexist);
        ModelMapper modelMapper = new ModelMapper();
        apartment1 = modelMapper.map(apartmentDto,Apartment.class);

         if(isOwnerexist)
          return    apartmentRepo.save(apartment1);
         else {
             //need to add some meaning info
             return null;
         }
    }

}
