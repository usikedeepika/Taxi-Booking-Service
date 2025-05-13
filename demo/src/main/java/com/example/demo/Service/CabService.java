package com.example.demo.Service;

import com.example.demo.Exception.DriverNotFoundException;
import com.example.demo.Model.Cab;
import com.example.demo.Model.Driver;
import com.example.demo.Repository.DriverRepository;
import com.example.demo.Transformer.CabTransformor;
import com.example.demo.dto.request.CabRequest;
import com.example.demo.dto.response.CabResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CabService {


    @Autowired
    DriverRepository driverRepository;

    public CabResponse registerCab(CabRequest cabRequest, int id){

        Optional<Driver> opt=driverRepository.findById(id);
        if(opt.isEmpty()){
            throw  new DriverNotFoundException("Driver not found exception");
        }

        Driver driver=opt.get();

        Cab cab=CabTransformor.CabRequestToCab(cabRequest);

        driver.setCab(cab);

         Driver savedDriver= driverRepository.save(driver);

        CabResponse cabResponse=CabTransformor.CabToCabResponse(savedDriver.getCab(),savedDriver);

        return  cabResponse;


    }
}
