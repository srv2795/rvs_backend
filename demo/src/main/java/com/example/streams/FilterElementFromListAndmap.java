package com.example.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterElementFromListAndmap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rashi","Kunoor","Ajay","Mamtha","RanVijay",
                "Himanshu","Rohan","Chetan", "Saroj","Kapil");
        System.out.println("name of student starting with R : ");
        // First way
        List<String> filteredList = list.stream().map(String::toUpperCase).filter(x -> x.startsWith("R")).collect(Collectors.toList());
        Iterator<String> itr = filteredList.iterator();
        while(itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }
        // Alternative way to do the same as above
        //Second way
        System.out.println();
        list.stream().map(String::toUpperCase).filter(x -> x.startsWith("R")).forEach(System.out::println);
    }
}
