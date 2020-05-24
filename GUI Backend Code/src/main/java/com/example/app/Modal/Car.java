package com.example.app.Modal;

import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "car")
public class Car {
    @Id
    private String vehiclePlateNum;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleColour;
    private String vehicleRegNum;
    private BigDecimal vehicleRatePerDay;
    private String carBodyDesc;
    private String carEngineDesc;
    private String carTransmission;

    public Car() { }

    @PersistenceConstructor
    public Car(String vehiclePlateNum, String vehicleMake, String vehicleModel, String vehicleColour, String vehicleRegNum, BigDecimal vehicleRatePerDay, String carBodyDesc, String carEngineDesc, String carTransmission) {
        this.vehiclePlateNum = vehiclePlateNum;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleColour = vehicleColour;
        this.vehicleRegNum = vehicleRegNum;
        this.vehicleRatePerDay = vehicleRatePerDay;
        this.carBodyDesc = carBodyDesc;
        this.carEngineDesc = carEngineDesc;
        this.carTransmission = carTransmission;
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

    public String getCarBodyDesc() {
        return carBodyDesc;
    }

    public void setCarBodyDesc(String carBodyDesc) {
        this.carBodyDesc = carBodyDesc;
    }

    public String getCarEngineDesc() {
        return carEngineDesc;
    }

    public void setCarEngineDesc(String carEngineDesc) {
        this.carEngineDesc = carEngineDesc;
    }

    public String getCarTransmission() {
        return carTransmission;
    }

    public void setCarTransmission(String carTransmission) {
        this.carTransmission = carTransmission;
    }
}
