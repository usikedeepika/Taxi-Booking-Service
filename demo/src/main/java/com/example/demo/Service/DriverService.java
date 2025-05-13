package com.example.demo.Service;

import com.example.demo.Model.Driver;
import com.example.demo.Repository.DriverRepository;
import com.example.demo.Transformer.DriverTransformer;
import com.example.demo.dto.request.DriverRequest;
import com.example.demo.dto.response.DriverResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;
    public DriverResponse addDriver(DriverRequest driverRequest) {

        Driver driver= DriverTransformer.DriverRequestToDriver(driverRequest);

        Driver savedDriver= driverRepository.save(driver);

        DriverResponse answer=DriverTransformer.DrivertoDriverResponse(savedDriver);
        return answer;


    }

    public List<DriverResponse> getAllDriver() {


        List<Driver> drivers=driverRepository.findAll();

        List<DriverResponse>  alldrivers=new ArrayList<>();

        for(Driver driver:drivers){
            alldrivers.add(DriverTransformer.DrivertoDriverResponse(driver));
        }
        return alldrivers;

    }
}
