package com.example.demo.Service;
import com.example.demo.Model.Driver;

import com.example.demo.Exception.CabNotAvailableException;
import com.example.demo.Exception.CustomerNotFoundException;
import com.example.demo.Model.Booking;
import com.example.demo.Model.Cab;
import com.example.demo.Model.Customer;
import com.example.demo.Repository.BookingRepository;
import com.example.demo.Repository.CabRepository;
import com.example.demo.Repository.CustomerReposiory;
import com.example.demo.Repository.DriverRepository;
import com.example.demo.Transformer.BookingTransformer;
import com.example.demo.Transformer.CustomerTransformer;
import com.example.demo.dto.request.BookingRequest;
import com.example.demo.dto.response.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    CustomerReposiory customerReposiory;

    @Autowired
    CabRepository cabRepository;

    @Autowired
    DriverRepository driverRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    JavaMailSender javaMailSender;




    public BookingResponse bookCab(BookingRequest bookingRequest,int customerId){

        Optional<Customer>  optionalCustomer=customerReposiory.findById(customerId);

        if(optionalCustomer.isEmpty())
        {
            throw new CustomerNotFoundException("Invalid customer Id");
        }

        Customer customer=optionalCustomer.get();

        Cab availableCab=cabRepository.getAvailableCab();
        if(availableCab==null){
            throw  new CabNotAvailableException("Sorry Cab is Unavailable");
        }

        Booking booking= BookingTransformer.BookingRequestToBooking(bookingRequest,availableCab.getPerKmRate());

        availableCab.setAvailable(false);   // the cab will become unavailable because it is allocated

        customer.getBookings().add(booking);


        Driver driver=driverRepository.getDriverByCabId(availableCab.getCabId());

       driver.getBookings().add(booking);

       Booking savedBooking=bookingRepository.save(booking);

       Customer savedCustomer=customerReposiory.save(customer);



        sendMail(savedCustomer); //sending the mail to the customer



        Driver savedDriver=driverRepository.save(driver);


       BookingResponse bookingResponse=BookingTransformer.BookingToBookingResponse(savedBooking,savedCustomer,savedDriver,availableCab);

       return  bookingResponse;
    }

    void sendMail(Customer customer)
    {

        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();

        simpleMailMessage.setFrom("usikedeepika312@gmail.com");
        simpleMailMessage.setTo(customer.getEmailId());
        simpleMailMessage.setSubject("Cab Booked");
        simpleMailMessage.setText("Congragulations cab id booked");
        javaMailSender.send(simpleMailMessage);


    }


}
