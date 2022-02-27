package com.example.springbootexample.controller;

import com.example.springbootexample.model.Student;
import com.example.springbootexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public ResponseEntity<?> getAllStudent() {
        List<Student> list = studentService.getAllStudent();
        //return studentService.getAllStudent();
        return new ResponseEntity<List>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getSingleStudent(id);
    }

    @PostMapping("/addStudent")
    public void AddStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        Student student = studentService.deleteStudent(id);
        return (student.getName() + " is removed from the record");
    }

}
