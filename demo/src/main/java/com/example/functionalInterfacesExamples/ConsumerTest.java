package com.example.functionalInterfacesExamples;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {

        ConsumerDemo cd = new ConsumerDemo();
        cd.accept("RanvijaySingh");

        System.out.println("------------------------------------------------------------------------");

        Consumer<String> cst = x -> System.out.println("The length of the input string is : " + x.length());
        cst.accept("RanVijaySingh");
    }
}

class ConsumerDemo {
    public void accept(String str) {
        System.out.println("The length of the input string is : " + str.length());
    }
}
