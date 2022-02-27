package com.example.springbootexample.service;

import com.example.springbootexample.exception.EmptyListException;
import com.example.springbootexample.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1,"Ashu",23));
        studentList.add(new Student(2,"Chetan",24));
        studentList.add(new Student(3,"Mamtha",26));
        studentList.add(new Student(4,"Roli",27));
        studentList.add(new Student(5,"himanshu",28));
    }

    public List<Student> getAllStudent() {
        if(studentList.size() == 0) {
            throw new EmptyListException("400", "no element is list present");
        }
        return studentList;
    }

    public Student getSingleStudent(int id) {
        return studentList.get(id);
    }

    public void addNewStudent(Student student) {
        studentList.add(student);
    }

    public Student deleteStudent(int id) {
        Student student = studentList.stream().filter(x -> x.getId() == id).findFirst().get();
        studentList.remove(student);
        return student;
    }
}
