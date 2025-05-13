package com.example.demo.dto.response;

public class DriverResponse {

    private int driverId;
    private int age;
    private String name;
    private String emailId;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public DriverResponse(int driverId, int age, String name, String emailId) {
        this.driverId = driverId;
        this.age = age;
        this.name = name;
        this.emailId = emailId;
    }
    public DriverResponse(){

    }
}
