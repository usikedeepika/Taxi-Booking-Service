package com.example.demo.dto.response;

public class CabResponse {

    private String cabModel;
    private  String cabNumber;

    private double perKmRate;
    public Boolean available;

    private DriverResponse driverResponse;

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

    public double etPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(double perKmRate) {
        this.perKmRate = perKmRate;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public DriverResponse getDriverResponse() {
        return driverResponse;
    }

    public void setDriverResponse(DriverResponse driverResponse) {
        this.driverResponse = driverResponse;
    }

    public CabResponse(String cabModel, String cabNumber, double perKmRate, Boolean available, DriverResponse driverResponse) {
        this.cabModel = cabModel;
        this.cabNumber = cabNumber;
        this.perKmRate = perKmRate;
        this.available = available;
        this.driverResponse = driverResponse;
    }
    public CabResponse(){

    }
}
