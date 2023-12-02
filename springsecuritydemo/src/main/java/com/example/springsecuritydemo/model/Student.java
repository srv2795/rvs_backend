package com.example.springsecuritydemo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
