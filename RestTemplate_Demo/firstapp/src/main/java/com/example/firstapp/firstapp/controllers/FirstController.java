package com.example.firstapp.firstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/app/")
public class FirstController {

    @GetMapping("/first")
    public String getStatement() {
        String str1 = "Hello first app. I'm Ran Vijay Singh";
        String str2 = new RestTemplate().getForObject("http://localhost:8081/v1/app/second", String.class);
        return str1 +" and "+ str2;
    }
}
