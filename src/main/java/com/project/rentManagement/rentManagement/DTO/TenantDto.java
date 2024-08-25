package com.project.rentManagement.rentManagement.DTO;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Data
public class TenantDto {

    int id;
    String contact_number;
    String name;
    String room_id;
   Date join_date ;
    Date  leaveOut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomId() {
        return room_id;
    }

    public void setRoomId(String roomId) {
        this.room_id = roomId;
    }

    public Date getJoinDate() {
        return join_date;
    }

    public void setJoinDate(Date joinDate) {
        this.join_date = joinDate;
    }

    public Date getLeaveOut() {
        return leaveOut;
    }

    public void setLeaveOut(Date leaveOut) {
        this.leaveOut = leaveOut;
    }
}
