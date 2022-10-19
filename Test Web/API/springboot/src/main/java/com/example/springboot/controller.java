package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping(value = "/spring", method = RequestMethod.GET)
    public String springapi(){
        return "Hello SpringBoot";
    }
}
