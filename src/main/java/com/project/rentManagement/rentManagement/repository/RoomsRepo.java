package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoomsRepo extends JpaRepository<Room,Integer> {

    @Query("SELECT r.rent FROM Room r WHERE r.roomID=:roomid")
    Double findRoomRent(@Param("roomid")Integer roomid);

}
