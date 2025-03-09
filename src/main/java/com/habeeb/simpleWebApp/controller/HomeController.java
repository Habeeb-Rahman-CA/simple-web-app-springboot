package com.habeeb.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Welcome to SpringBoot";
    };

    @RequestMapping("/about")
    public String about(){
        return "Im the about page";
    }
    
}