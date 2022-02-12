package com.example.streams;

import java.util.stream.IntStream;

public class StreamDemo1 {
    // 1. Integer Stream
    public static void main(String[] args) {
        IntStream.range(0,5).forEach(System.out::println);
    }
}

//    https://www.youtube.com/watch?v=t1-YZ6bF-g0
