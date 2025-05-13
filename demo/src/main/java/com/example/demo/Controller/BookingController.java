package com.example.demo.Controller;

import com.example.demo.Service.BookingService;
import com.example.demo.dto.request.BookingRequest;
import com.example.demo.dto.response.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("/book-cab")
    public BookingResponse bookCab(@RequestBody BookingRequest bookingRequest, @RequestParam int customerId){

      return   bookingService.bookCab(bookingRequest,customerId);
        


    }
}
