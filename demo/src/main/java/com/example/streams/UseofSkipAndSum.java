package com.example.streams;

import java.util.stream.IntStream;

public class UseofSkipAndSum {
    public static void main(String[] args) {
        // skip the first five elements
        IntStream.range(1,10).skip(5).forEach(x -> System.out.println(x));
        // sum of the integer defined in the range
        System.out.println("Sum of integer defined in the range");
        System.out.println(IntStream.range(1, 10).sum());
    }
}
