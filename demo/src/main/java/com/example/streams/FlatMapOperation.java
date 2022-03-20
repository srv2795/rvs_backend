package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapOperation {
    public static void main(String[] args) {
        List<String> list1ofCities = new ArrayList<>();
        list1ofCities.add("Delhi");
        list1ofCities.add("Mumbai");
        list1ofCities.add("kolkata");

        List<String> list2ofCities = new ArrayList<>();
        list2ofCities.add("Delhi");
        list2ofCities.add("Chennai");
        list2ofCities.add("Noida");
        list2ofCities.add("Bangalore");

        List<String> list3ofCities = new ArrayList<>();
        list3ofCities.add("Hyderabad");
        list3ofCities.add("Delhi");
        list3ofCities.add("Noida");

        Employee e1 = new Employee(1, "Ashu", list1ofCities);
        Employee e2 = new Employee(2, "Himanshu", list2ofCities);
        Employee e3 = new Employee(3, "Chetan", list3ofCities);

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        for(Employee e : empList) {
            System.out.println("Employee "+ e + " has worked in these cities " + e.getCities());
        }
        System.out.println("-----------------------------------------------------------------");
        List<List<String>>  stringList = empList.stream()
                .map(emp -> emp.getCities()).collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("-----------------------------------------------------------------");

        Set<String> stringSet = empList.stream().flatMap(emp -> emp.getCities().stream())
                        .collect(Collectors.toSet());
        System.out.println(stringSet);


    }
}

class Employee {
    private int eId;
    private String name;
    private List<String> cities;

    public Employee(int eId, String name, List<String> cities) {
        this.eId = eId;
        this.name = name;
        this.cities = cities;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }
}
