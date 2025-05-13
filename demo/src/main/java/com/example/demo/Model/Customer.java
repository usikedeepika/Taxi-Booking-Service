package com.example.demo.Model;

import com.example.demo.Enum.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Type;
import java.util.List;


@Entity
public class Customer {



    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private  int customerId;

    private String  name;

    private int age;

    @Column(unique = true,nullable = false)
    private String emailId;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Customer(){}

    public Customer(int customerId, String name, int age, String emailId, Gender gender) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.gender = gender;
    }

    @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name="customer_id")
   List<Booking> bookings;

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
