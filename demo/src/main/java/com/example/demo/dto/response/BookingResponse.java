package com.example.demo.dto.response;

import com.example.demo.Enum.TripStatus;
import com.example.demo.Model.Customer;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

public class BookingResponse {
    private double billAmount;

    private Date bookedAt;
    private String destination;

    private Date lastUpdateAt;

    private String pickUp;

    private double distanceInKm;

    private TripStatus tripStatus;

    private CabResponse cab;
    private CustomerResponse customerResponse;

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public Date getBookedAt() {
        return bookedAt;
    }

    public void setBookedAt(Date bookedAt) {
        this.bookedAt = bookedAt;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getLastUpdateAt() {
        return lastUpdateAt;
    }

    public void setLastUpdateAt(Date lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public CabResponse getCab() {
        return cab;
    }

    public void setCab(CabResponse cab) {
        this.cab = cab;
    }

    public CustomerResponse getCustomerResponse() {
        return customerResponse;
    }

    public void setCustomerResponse(CustomerResponse customerResponse) {
        this.customerResponse = customerResponse;
    }

    public BookingResponse(double billAmount, Date bookedAt, String destination, Date lastUpdateAt, String pickUp, double distanceInKm, TripStatus tripStatus, CabResponse cab, CustomerResponse customerResponse) {
        this.billAmount = billAmount;
        this.bookedAt = bookedAt;
        this.destination = destination;
        this.lastUpdateAt = lastUpdateAt;
        this.pickUp = pickUp;
        this.distanceInKm = distanceInKm;
        this.tripStatus = tripStatus;
        this.cab = cab;
        this.customerResponse = customerResponse;
    }
    public BookingResponse(){

    }

}
