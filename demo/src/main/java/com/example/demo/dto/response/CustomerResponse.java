package com.example.demo.dto.response;

public class CustomerResponse {

    private int age;
    private String name;
    private String emailId;

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

    public CustomerResponse(int age, String name, String emailId) {
        this.age = age;
        this.name = name;
        this.emailId = emailId;
    }

    public CustomerResponse(){

    }

}
