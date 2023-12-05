package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.AuthRequest;
import com.example.springsecuritydemo.model.Student;
import com.example.springsecuritydemo.service.JwtService;
import com.example.springsecuritydemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/get")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public List<Student> createStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PostMapping("/auth")
    public Object authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if(authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        }  else {
            return new UsernameNotFoundException("Invalid user : " + authRequest.getUsername());
        }
    }
}
