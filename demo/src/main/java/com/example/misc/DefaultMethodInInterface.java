package com.example.misc;

public class DefaultMethodInInterface implements Test1 {
    public static void main(String[] args) {
        Abc a = new Abc();
        a.m1();

        DefaultMethodInInterface df = new DefaultMethodInInterface();
        df.m1();

        //diamond problem resolution
        TestImpl tl= new TestImpl();
        tl.m1();

        // calling static method from interface1
        Test1.m2();;
    }

}

interface Test1 {

    default void m1() {
        System.out.println("I am from Test1 interfaces");
    }

    static void m2() {
        System.out.println("I am in static method of interface1");
    }
}

interface Test2 {
    default void m1() {
        System.out.println("I am from Test2 interface");
    }
}

class Abc implements Test1 {
    public void m1() {
        System.out.println("I am an overridden implementation of default method ");
    }
}

class TestImpl implements Test1, Test2 {
    public void m1() {
        Test2.super.m1();
    }
}
