package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/send")
public class HomeController {

    @GetMapping("/getData")
    public String getData(){
        return "Hello I am Deepika Usike";
    }
}
