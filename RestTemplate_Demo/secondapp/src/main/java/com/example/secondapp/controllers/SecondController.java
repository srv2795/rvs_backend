package com.example.secondapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/app/")
public class SecondController {

    @GetMapping("/second")
    public String getStatement() {
        return "Hello first app. I'm Vijay Pratap Singh";
    }
}
