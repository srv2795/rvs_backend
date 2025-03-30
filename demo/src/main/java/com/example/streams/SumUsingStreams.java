package com.example.streams;

import java.util.*;
import java.util.stream.Collectors;

public class SumUsingStreams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,3,5,7,5,7,8,9,0,12,34,14);
        Optional<Integer> sum = list.stream().reduce((a,b) -> (a+b));
        System.out.println("sum of numbers : "+ sum.get());
        System.out.println("below are even numbers from the list.");
        System.out.println(list.stream().filter(x -> (x%2 == 0)).collect(Collectors.toList()));
        System.out.println("Sum of numbers : " + list.stream().mapToInt(e -> e).sum());

        List<Integer> value1 = list.stream().map(x -> x*x).collect(Collectors.toList());
        for(int x : value1) {
            System.out.println(x);
        }
        double value = list.stream().map(x -> x*x).filter(x -> x< 50).mapToInt(x -> x).average().getAsDouble();
        System.out.println("average of square less than 50 : " + value);

        // print number prefixed with 1
        List<Integer> values = list.stream().filter(x -> String.valueOf(x).startsWith("1")).collect(Collectors.toList());
        for(int x : values) {
            System.out.println("values : " + x);
        }

        // find the duplicates
        Set<Integer> duplicates = list.stream().filter(x -> Collections.frequency(list, x) > 1).collect(Collectors.toSet());
        System.out.println(duplicates);

        //max number
        int max = list.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(max);

        //min number
        int min = list.stream().min(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(min);



        Set<Integer> set = new HashSet<>();
        Set<Integer>  newList = list.stream().sorted().collect(Collectors.toList())
                .stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
        System.out.println(newList);
        Integer number = list.stream().sorted().collect(Collectors.toList())
                .stream().filter(x -> !set.add(x)).collect(Collectors.toSet())
                .stream().limit(3).max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(number);

        //2nd greatest number
        int abc = list.stream().sorted(Collections.reverseOrder())
                .distinct()
                .limit(3)
                .skip(1)
                .collect(Collectors.toList())
                .stream().findFirst().get();
        System.out.println("Second highest : " + abc);

        //3rd smallest number
        int n = list.stream().sorted().distinct().limit(3).max(Comparator.comparing(Integer::intValue)).get();
        System.out.println("third smallest : " + n);
    }
}


