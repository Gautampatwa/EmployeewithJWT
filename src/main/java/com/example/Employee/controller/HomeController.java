package com.example.Employee.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class HomeController {

    @RequestMapping("/hello")
    public String m1 ()
    {
        return Arrays.asList("Hello","Gautam").toString();
    }
}
