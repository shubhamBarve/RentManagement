package com.project.rentManagement.rentManagement.validator;

import com.project.rentManagement.rentManagement.DTO.OwnerDto;
import com.project.rentManagement.rentManagement.model.Owner;
import com.project.rentManagement.rentManagement.repository.OwnerRepo;
import jakarta.persistence.Column;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class OwnerValidator {
    @Autowired
    OwnerRepo ownerRepo;


    public boolean validateOwner(OwnerDto ownerDto){




        boolean ownerExist = ownerRepo.existsBycontactInfo(ownerDto.getContactInfo());
if(ownerExist){
    return false;
}
        String ownerName =  genrateOwnerUserID(ownerDto.getOwnerName());
        ownerDto.setUsername(ownerName);

        System.out.println(ownerName);



        ModelMapper modelMapper = new ModelMapper();
        Owner owner = modelMapper.map(ownerDto,Owner.class);
        System.out.println("Owner");

        ownerRepo.save(owner);

        return true;
    }

    public String genrateOwnerUserID(String ownerName){

        String arr[]=ownerName.split(" ");

        String firstName = arr[0];
        String lastName = arr[1];

        Character firstChar = firstName.charAt(0);
        Character secondChar = lastName.charAt(0);
        Character lastChar = lastName.charAt(lastName.length()-1);

        Random random =new Random();
        int uniq = random.nextInt(100);


        return ""+firstChar+secondChar+lastChar+uniq;

    }

}
