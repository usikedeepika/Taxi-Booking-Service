package com.example.demo.Exception;

public class CabNotAvailableException extends RuntimeException{

    public CabNotAvailableException(String message){
        super(message);
    }
}
