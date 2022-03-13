package com.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMinFromStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> filteredList = list.stream().filter(i -> (i%2==0)).collect(Collectors.toList());
        filteredList.forEach(System.out::println);
        Comparator<Integer> c = Comparator.comparing(x -> x);
        System.out.println("Minimum value is given below:");
        System.out.println(filteredList.stream().max(c).get());
    }
}
