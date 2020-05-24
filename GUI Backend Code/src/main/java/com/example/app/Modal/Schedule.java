package com.example.app.Modal;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    private String scheduleID;
    private String customerID;
    private String vehiclePlateNum;
    private Date pickUpDate;
    private Date dropOffDate;


    public Schedule(String scheduleID, String customerID, String vehiclePlateNum, Date pickUpDate, Date dropOffDate) {
        this.scheduleID = scheduleID;
        this.customerID = customerID;
        this.vehiclePlateNum = vehiclePlateNum;
        this.pickUpDate = pickUpDate;
        this.dropOffDate = dropOffDate;
    }

    public Schedule() {
    }

    public String getScheduleID() {
        return scheduleID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public String getVehiclePlateNum() {
        return vehiclePlateNum;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(Date dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleID='" + scheduleID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", vehiclePlateNum='" + vehiclePlateNum + '\'' +
                ", pickUpDate=" + pickUpDate +
                ", dropOffDate=" + dropOffDate +
                '}';
    }
}



