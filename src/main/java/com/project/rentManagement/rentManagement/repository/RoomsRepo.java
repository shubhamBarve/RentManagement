package com.project.rentManagement.rentManagement.repository;

import com.project.rentManagement.rentManagement.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomsRepo extends JpaRepository<Room,Integer> {
}
