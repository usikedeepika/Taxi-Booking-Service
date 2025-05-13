package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cab {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int cabId;
    private String cabModel;
    private  String cabNumber;

    private double perKmRate;
    public Boolean available;

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public int getCabId() {
        return cabId;
    }

    public void setCabId(int cabId) {
        this.cabId = cabId;
    }

    public String getCabModel() {
        return cabModel;
    }

    public void setCabModel(String cabModel) {
        this.cabModel = cabModel;
    }

    public String getCabNumber() {
        return cabNumber;
    }

    public void setCabNumber(String cabNumber) {
        this.cabNumber = cabNumber;
    }

    public double getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(double perKmRate) {
        this.perKmRate = perKmRate;
    }

    public Cab(int cabId, String cabModel, String cabNumber, double perKmRate,Boolean available) {
        this.cabId = cabId;
        this.cabModel = cabModel;
        this.cabNumber = cabNumber;
        this.perKmRate = perKmRate;
        this.available=available;
    }

    public Cab(){

    }
}
