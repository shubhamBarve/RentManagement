package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepo extends JpaRepository<Owner, Integer> {

    public boolean existsBycontactInfo(String contactInfo);

    public boolean existsByownerID(int ownerid);
}
