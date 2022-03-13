package com.example.functionalInterfacesExamples;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        System.out.println("Square of two numbers : " + square(5));
        System.out.println();
        System.out.println("Using java 8 functional interface (Function)");
        Function<Integer, Integer> number = x -> x * x;
        System.out.println("Square of two numbers : " + number.apply(5));

        // functional chaining
        Function<Integer, Integer> squareValue = x -> x * x;
        Function<Integer, Integer> cubeValue = x -> x * x * x;
        System.out.println("square and then cubing the number using compose() of Function functional interface : " + squareValue.compose(cubeValue).apply(3));
        System.out.println("square and then cubing the number using andThen() of Function functional interface : " + squareValue.andThen(cubeValue).apply(3));
        System.out.println("cubing and then squaring the number : " + cubeValue.compose(squareValue).apply(3));


    }

    public static int square(int num) {
        return num * num;
    }
}
