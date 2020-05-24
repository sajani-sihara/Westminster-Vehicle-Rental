package com.example.app.Modal;

import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "motorbike")
public class Motorbike {
    @Id
    private String vehiclePlateNum;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleColour;
    private String vehicleRegNum;
    private BigDecimal vehicleRatePerDay;
    private String bikeCategory;
    private String bikeCoolingSystem;

    public Motorbike() {
    }

    @PersistenceConstructor
    public Motorbike(String vehiclePlateNum, String vehicleMake, String vehicleModel, String vehicleColour, String vehicleRegNum, BigDecimal vehicleRatePerDay, String bikeCategory, String bikeCoolingSystem) {
        this.vehiclePlateNum = vehiclePlateNum;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleColour = vehicleColour;
        this.vehicleRegNum = vehicleRegNum;
        this.vehicleRatePerDay = vehicleRatePerDay;
        this.bikeCategory = bikeCategory;
        this.bikeCoolingSystem = bikeCoolingSystem;
    }

    public String getVehiclePlateNum() {
        return vehiclePlateNum;
    }

    public void setVehiclePlateNum(String vehiclePlateNum) {
        this.vehiclePlateNum = vehiclePlateNum;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleColour() {
        return vehicleColour;
    }

    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }

    public String getVehicleRegNum() {
        return vehicleRegNum;
    }

    public void setVehicleRegNum(String vehicleRegNum) {
        this.vehicleRegNum = vehicleRegNum;
    }

    public BigDecimal getVehicleRatePerDay() {
        return vehicleRatePerDay;
    }

    public void setVehicleRatePerDay(BigDecimal vehicleRatePerDay) {
        this.vehicleRatePerDay = vehicleRatePerDay;
    }

    public String getBikeCategory() {
        return bikeCategory;
    }

    public void setBikeCategory(String bikeCategory) {
        this.bikeCategory = bikeCategory;
    }

    public String getBikeCoolingSystem() {
        return bikeCoolingSystem;
    }

    public void setBikeCoolingSystem(String bikeCoolingSystem) {
        this.bikeCoolingSystem = bikeCoolingSystem;
    }
}




