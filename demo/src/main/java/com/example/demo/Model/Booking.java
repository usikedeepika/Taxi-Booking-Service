package com.example.demo.Model;

import com.example.demo.Enum.TripStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
public class Booking {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int bookingId;

    private double billAmount;

    @CreationTimestamp
    private Date bookedAt;
    private String destination;

    @UpdateTimestamp
    private Date lastUpdateAt;

    private String pickUp;

    private double distanceInKm;


    @Enumerated(EnumType.STRING)
    private TripStatus tripStatus;


    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

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

    public Booking(int bookingId, double billAmount, Date bookedAt, String destination, Date lastUpdateAt, String pickUp, double distanceInKm, TripStatus tripStatus) {
        this.bookingId = bookingId;
        this.billAmount = billAmount;
        this.bookedAt = bookedAt;
        this.destination = destination;
        this.lastUpdateAt = lastUpdateAt;
        this.pickUp = pickUp;
        this.distanceInKm = distanceInKm;
        this.tripStatus = tripStatus;
    }
    public Booking(){

    }
}


