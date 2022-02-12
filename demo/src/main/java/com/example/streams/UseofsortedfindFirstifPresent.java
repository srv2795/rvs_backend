package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UseofsortedfindFirstifPresent {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("chetan");
        names.add("vijay");
        names.add("ran");
        names.add("saroj");
        // Use of findFirst(), ifpresent,
        names.stream().findFirst().ifPresent(x -> System.out.println(x));

        // Use of of(), count(), sorted()
        System.out.println(Stream.of("chetan", "ashu", "vijay", "saroj").count());
        Stream.of("chetan", "ashu", "vijay", "saroj").sorted().forEach(x -> System.out.println(x));

        String[] arr = {"B", "A", "E", "C", "F", "D"};
        Arrays.stream(arr).sorted().findAny().ifPresent(System.out::println);
        System.out.println("-----------------------------");
        Arrays.stream(arr).filter(x -> x.startsWith("E")).sorted().forEach(System.out::println);

        // map, average, ifpresent
        int[] ar1 = new int[]{1,2,3,4,5};
        Arrays.stream(ar1).map(x -> x*x).forEach(System.out::println);
        System.out.println("average of 5 numbers ");
        Arrays.stream(ar1).map(x -> x*x).average().ifPresent(System.out::println);
    }
}
