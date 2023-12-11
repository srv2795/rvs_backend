package com.example.SecureApp.Controller;

import com.example.SecureApp.model.User;
import com.example.SecureApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/normal")
    public List<User> getUser() {
        return userService.getUsers();
    }
}
