package com.example.demo.Service;

import com.example.demo.Exception.CustomerNotFoundException;
import com.example.demo.Enum.Gender;
import com.example.demo.Model.Customer;
import com.example.demo.Repository.CustomerReposiory;
import com.example.demo.Transformer.CustomerTransformer;
import com.example.demo.dto.request.CustomerRequest;
import com.example.demo.dto.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerReposiory customerReposiory;

    public CustomerResponse addCustomer(CustomerRequest customer){

       Customer sendCustomer=CustomerTransformer.CustomerRequestToCustomer(customer);

       Customer savedCustomer=customerReposiory.save(sendCustomer);

        return CustomerTransformer.CustomerToCustomerResponse(savedCustomer);
    }

    public CustomerResponse getById(int customerId) {
        Optional<Customer> result=customerReposiory.findById(customerId);
        if(result.isEmpty()){
            throw new CustomerNotFoundException("Customer not found");
        }

        CustomerResponse answer= CustomerTransformer.CustomerToCustomerResponse(result.get());
        return answer;

    }

    public  List<CustomerResponse>  findByGenderAndAge(@RequestParam Gender gender, @RequestParam int age){

        List<Customer> customers=customerReposiory.findByGenderAndAge(gender,age);

        List<CustomerResponse> customerAnswers=new ArrayList<>();

        for(Customer customer:customers){
            customerAnswers.add(CustomerTransformer.CustomerToCustomerResponse(customer));
        }

        return  customerAnswers;

    }

    public List<CustomerResponse> getCustomerAgeGreaterGender(Gender gender, int age){

        List<Customer> retrived=customerReposiory.getCustomerAgeGreaterGender(gender,age);

        List<CustomerResponse> answers=new ArrayList<>();

        for(Customer c:retrived){
            answers.add(CustomerTransformer.CustomerToCustomerResponse(c));
        }
        return answers;
    }

  public List<CustomerResponse>  getCustomerAgeLessGender(String gender,int age){

        List<Customer> retrieved=customerReposiory.getCustomerAgeLessGender(gender,age);

        List<CustomerResponse> ans=new ArrayList<>();

        for(Customer c:retrieved){
            ans.add(CustomerTransformer.CustomerToCustomerResponse(c));
        }
        return ans;




  }



}
