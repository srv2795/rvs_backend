package com.example.sso.SingleSignOnDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/wish")
public class HelloController {

    @GetMapping("/mrng")
    public String getHello() {
        return "Hello guy";
    }

    @GetMapping("eve")
    public String wishEvening() {
        return "Hello sir, GOod evening. How may I help you...! ";
    }

    @GetMapping("/night")
    public String wishNight() {
        return "It was nice talking to you, good night, see you tomorrow...!";
    }
}
