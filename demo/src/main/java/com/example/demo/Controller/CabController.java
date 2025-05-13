package com.example.demo.Controller;

import com.example.demo.Service.CabService;
import com.example.demo.dto.request.CabRequest;
import com.example.demo.dto.response.CabResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cab")
public class CabController {

   @Autowired
    CabService cabService;
    @PostMapping("/regiser-cab")
    public CabResponse registerCab(@RequestBody CabRequest cab, @RequestParam int driverId){

        return  cabService.registerCab(cab,driverId);

    }
}
