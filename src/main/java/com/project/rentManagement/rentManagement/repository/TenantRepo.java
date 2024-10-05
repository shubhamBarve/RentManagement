package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TenantRepo extends JpaRepository<Tenant,Integer> {
    @Query("select t.tenantID from Tenant t where t.room.roomID=:roomid")
    Integer getTenantIDfromRoomID(@Param("roomid")Integer roomID) ;

    //@Query("SELECT t.tenantID FROM Tenant t WHERE t.room.roomID = :roomid")
    //Integer findTenantByRoomID(@Param("roomid") Integer roomID);
}
