package com.example.demo.Controller;

import com.example.demo.Service.DriverService;
import com.example.demo.dto.request.DriverRequest;
import com.example.demo.dto.response.DriverResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping("/add")
    public DriverResponse addDriver(@RequestBody DriverRequest driverRequest){

        return driverService.addDriver(driverRequest);
    }

    @GetMapping("/allDrivers")
    public List<DriverResponse>  getAllDrivers(){
        return  driverService.getAllDriver();
    }
}
