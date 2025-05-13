package com.example.demo.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int driverId;
    private  int age;

    @Column(unique = true,nullable = false)
    private String emailId;

    private String name;

    @OneToMany(cascade = jakarta.persistence.CascadeType.ALL)
    @JoinColumn(name="driver_id")
    List<Booking> bookings=new ArrayList<>();


    @OneToOne(cascade =jakarta.persistence.CascadeType.ALL)
    @JoinColumn(name="cab_id")
    Cab cab;

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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver(int driverId, int age, String emailId, String name) {
        this.driverId = driverId;
        this.age = age;
        this.emailId = emailId;
        this.name = name;
    }

    public  Driver(){

    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

}
