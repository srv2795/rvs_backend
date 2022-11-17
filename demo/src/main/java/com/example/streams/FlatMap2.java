package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap2 {
    public static void main(String[] args) {
        Tester t1 = new Tester(1, "Ashu", Arrays.asList("hindi", "english", "maths"));
        Tester t2 = new Tester(2, "Himanshu", Arrays.asList("History", "social science", "maths"));
        Tester t3 = new Tester(3, "Chetan", Arrays.asList("science", "english", "hindi"));
        Tester t4 = new Tester(4, "Roli", Arrays.asList("geography", "economics", "maths"));

        List<Tester> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        System.out.println(list);

        for(Tester tester : list) {
            System.out.println("Student : " + tester);
        }

        List<List<String>> testerList = list.stream().map(tester -> tester.getSubject()).collect(Collectors.toList());
        System.out.println(testerList);

        Set<String> test1list = list.stream().flatMap(tester -> tester.getSubject().stream()).collect(Collectors.toSet());
        System.out.println(test1list);


    }
}
