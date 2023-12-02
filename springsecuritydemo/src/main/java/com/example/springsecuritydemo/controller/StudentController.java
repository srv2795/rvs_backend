package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.Student;
import com.example.springsecuritydemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/get")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public List<Student> createStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
}
