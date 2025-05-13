package com.example.demo.dto.request;

public class CabRequest {

     private String cabModel;
    private  String cabNumber;

    private double perKmRate;

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

    public CabRequest(String cabModel, String cabNumber, double perKmRate) {
        this.cabModel = cabModel;
        this.cabNumber = cabNumber;
        this.perKmRate = perKmRate;
    }

    public  CabRequest(){

    }
}
