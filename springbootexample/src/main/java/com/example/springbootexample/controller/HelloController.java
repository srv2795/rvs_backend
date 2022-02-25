package com.example.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello Spring boot....";
    }

    @GetMapping("/sms")
    public String GetMessage() {
        return "I am new to this technology....";
    }
}
