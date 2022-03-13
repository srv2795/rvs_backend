package com.example.functionalInterfacesExamples;

import java.util.function.Predicate;

public class SImplePredicateExample {
    public static void main(String[] args) {
        // conventional way to check length
      //  System.out.println(chckLength("Ran"));

        //using predicate to check the boolean value
        Predicate<String> chklength = x -> x.length() >= 5;
        Predicate<String> chklength2 = x -> x.length()%2 == 0;
        System.out.println(chklength.test("ranvijay"));
        System.out.println(chklength.and(chklength2).test("ranVijaySingh"));
        System.out.println(chklength.or(chklength2).test("ranvijaysingh"));
        System.out.println(chklength.and(chklength2).negate().test("ranVijaySingh"));
    }


    private static boolean chckLength(String str) {
        boolean flag = false;
        if(str.length() <= 5) {
            flag = true;
        }
        return flag;
    }
}
