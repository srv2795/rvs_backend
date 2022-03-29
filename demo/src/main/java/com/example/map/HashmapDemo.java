package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();
        Student s1 = new Student(1, "ashu");
        Student s2 = new Student(1, "ashu");
        map.put(s1, "elder brother");
        map.put(s2, "younger brother");
        System.out.println(map.size());
        System.out.println(s1.equals(s2));

    }
}

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.rollNo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass())
            return false;
        Student s = (Student) obj;

        return (this.rollNo == s.getRollNo() && this.name.equals(s.getName()));
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}
