package com.example.demo.Transformer;

import com.example.demo.Model.Driver;
import com.example.demo.dto.request.DriverRequest;
import com.example.demo.dto.response.DriverResponse;

public class DriverTransformer {

    public static DriverResponse DrivertoDriverResponse(Driver driver){

       DriverResponse driveranswer=new DriverResponse();
       driveranswer.setDriverId(driver.getDriverId());
       driveranswer.setAge(driver.getAge());
       driveranswer.setName(driver.getName());
       driveranswer.setEmailId(driver.getEmailId());

       return driveranswer;



    }

    public  static Driver DriverRequestToDriver(DriverRequest driverRequest){
        Driver driver=new Driver();
        driver.setName(driverRequest.getName());
        driver.setAge(driverRequest.getAge());
        driver.setEmailId(driverRequest.getEmailId());

        return driver;
    }


}
