package com.example.corejavademo;

public class OverloadingDemo {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m1();
        Parent p2 = new Child();
        p2.m1();
        Child c1 = new Child();
        c1.m1();;
    //    Child c2 = new Parent();
    //    c2.m1();
    }
}

class Parent {
    public void m1() {
        System.out.println("parent method called");
    }
}

class Child extends Parent {
    public void m1() {
        System.out.println("child method called");
    }
}
