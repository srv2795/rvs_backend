package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        Student s1 = new Student(1, "Ashu", 20);
        Student s2 = new Student(2, "Himanshu", 19);
        Student s3 = new Student(3, "Chetan", 22);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        return students;
    }

    public List<Student> addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
        return students;
    }
}
