package com.example.demo.dto.request;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

public class BookingRequest {


    private String destination;
    private String pickUp;
    private double distanceInKm;


    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }



    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public BookingRequest(String destination, String pickUp, double distanceInKm) {

        this.destination = destination;
        this.pickUp = pickUp;
        this.distanceInKm = distanceInKm;
    }

    public BookingRequest(){



    }
}
