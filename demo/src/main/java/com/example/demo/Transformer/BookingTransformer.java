package com.example.demo.Transformer;

import com.example.demo.Enum.TripStatus;
import com.example.demo.Model.Booking;
import com.example.demo.Model.Cab;
import com.example.demo.Model.Customer;
import com.example.demo.Model.Driver;
import com.example.demo.dto.request.BookingRequest;
import com.example.demo.dto.response.BookingResponse;

import java.util.Date;

public class BookingTransformer {

    public  static Booking BookingRequestToBooking(BookingRequest bookingRequest,double perKmRate){

        Booking booking=new Booking();
        booking.setDestination(bookingRequest.getDestination());
        booking.setDistanceInKm(bookingRequest.getDistanceInKm());
        booking.setPickUp(bookingRequest.getPickUp());
        booking.setTripStatus(TripStatus.IN_PROGRESS);
        booking.setBillAmount(bookingRequest.getDistanceInKm()*perKmRate);

        return booking;


    }

    public static BookingResponse BookingToBookingResponse(Booking booking, Customer customer, Driver driver, Cab cab){

        BookingResponse bookingResponse=new BookingResponse();
        bookingResponse.setBookedAt(booking.getBookedAt());
        bookingResponse.setTripStatus(booking.getTripStatus());
        bookingResponse.setBillAmount(booking.getBillAmount());
        bookingResponse.setPickUp(booking.getPickUp());
        bookingResponse.setLastUpdateAt(booking.getLastUpdateAt());
        bookingResponse.setDestination(booking.getDestination());
        bookingResponse.setDistanceInKm(booking.getDistanceInKm());

        bookingResponse.setCab(CabTransformor.CabToCabResponse(cab,driver));
        bookingResponse.setCustomerResponse(CustomerTransformer.CustomerToCustomerResponse(customer));

           return  bookingResponse;




//        private Date bookedAt;
//        private String destination;
//
//        private Date lastUpdateAt;
//
//        private String pickUp;
//
//        private double distanceInKm;
//
//        private Boolean tripStatus;

    }
}
