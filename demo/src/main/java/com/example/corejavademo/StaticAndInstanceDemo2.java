package com.example.corejavademo;

public class StaticAndInstanceDemo2 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1.m2();
        t1.m1();
    }
}

class Test1 {
    int x;
    public void m1() {
        System.out.println("I am in instance method");
    }
    static {
        int x;
        System.out.println("I am in static block");
    }

    {
        System.out.println("I am in instance block");
    }

    public static void m2() {
        System.out.println("I am in static method");
    }
}