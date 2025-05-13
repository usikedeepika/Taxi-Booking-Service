package com.example.demo.Controller;

import com.example.demo.Enum.Gender;
import com.example.demo.Service.CustomerService;
import com.example.demo.dto.request.CustomerRequest;
import com.example.demo.dto.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public CustomerResponse addCustomer(@RequestBody CustomerRequest customer){

        return   customerService.addCustomer(customer);
    }

    @GetMapping("/get/{customerId}")
      public CustomerResponse getById(@PathVariable("customerId") int customerId ){
        return customerService.getById(customerId);

    }

    @GetMapping("/get-by-gender-age")
    public List<CustomerResponse> getCustomerByGenderAge( @RequestParam Gender gender,@RequestParam int age){
        return  customerService.findByGenderAndAge(gender,age);
    }



    @GetMapping("/get-customer-ageGreater-gender")
    public List<CustomerResponse> getCustomerAgeGreaterGender(@RequestParam  Gender gender,@RequestParam int age){
        return customerService.getCustomerAgeGreaterGender(gender,age);
    }

    @GetMapping("/get-customer-ageLesser-gender")
    public List<CustomerResponse> getCustomerAgeLessGender(@RequestParam String gender,@RequestParam int age){

        return customerService.getCustomerAgeLessGender(gender,age);
    }



}
