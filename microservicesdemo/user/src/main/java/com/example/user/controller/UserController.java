package com.example.user.controller;


import com.example.user.model.Contact;
import com.example.user.model.User;
import com.example.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/all/{id}")
    public User getUserById(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        List<Contact> list = restTemplate.getForObject("http://contact-service:8083/contacts/"
                + user.getUserId(), List.class);
        user.setContacts(list);
        return user;
    }
}
