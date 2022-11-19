package com.example.corejavademo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortingByComparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(3,"Chetan"));
        list.add(new Student(2,"Saroj"));
        list.add(new Student(1,"Roop Narayan Singh"));
        list.add(new Student(4,"Himanshu"));
        list.add(new Student(5,"Ashu"));

        // Sorting by name
        StudentComparatorByName sc = new StudentComparatorByName();
        Collections.sort(list, sc);
        System.out.println("sorting on name");
        System.out.println("_________________");
        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()) {
            Student s = itr.next();
            System.out.println(s.getName()+ " : "+ s.getRollno());
        }
        System.out.println("=========================================================");
        // Sorting by roll no
        StudentComparatorByRollno sc2  = new StudentComparatorByRollno();
        Collections.sort(list, sc2);
        Iterator<Student> itr2 = list.iterator();
        System.out.println("sorting in increasing order of roll no");
        System.out.println("________________________________________");
        while(itr2.hasNext()) {
            Student st2 = itr2.next();
            System.out.println(st2.getName() + " : " + st2.getRollno());
        }
    }
}

class StudentComparatorByName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class StudentComparatorByRollno implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            if(s1.getRollno() < s2.getRollno()) {
                return -1;
            } else if(s1.getRollno() > s2.getRollno()) {
                return 1;
            } else {
                return 0;
            }
        }
}

class Student1 {
    private int rollno;
    private  String name;

    public Student1(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
