package com.example.demo.Transformer;

import com.example.demo.Model.Customer;
import com.example.demo.dto.request.CustomerRequest;
import com.example.demo.dto.response.CustomerResponse;

public class CustomerTransformer {

    public static Customer CustomerRequestToCustomer(CustomerRequest customerRequest){

        Customer customer=new Customer();

        customer.setAge(customerRequest.getAge());
        customer.setName(customerRequest.getName());
        customer.setGender(customerRequest.getGender());
        customer.setEmailId(customerRequest.getEmailId());

        return customer;
    }

    public static CustomerResponse CustomerToCustomerResponse(Customer customer){

        CustomerResponse customerResponse=new CustomerResponse();

        customerResponse.setAge(customer.getAge());
        customerResponse.setName(customer.getName());
        customerResponse.setEmailId(customer.getEmailId());

        return customerResponse;

    }
}
