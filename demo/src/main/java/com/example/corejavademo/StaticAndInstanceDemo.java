package com.example.corejavademo;

// Static and instance variable demo


public class StaticAndInstanceDemo {
    public static void main(String[] args) {
        Test t = new Test();
     //    t.x = 888;  ( output here is 888)// separate copy will be created for this object
        System.out.println(t.x);
        t.m1();
        Test.m2();
    }
}

class Test {
    int x=10;
    static int y= 20;
    public void m1() {
        x=888;
        y=999;
        System.out.println(x);
        System.out.println(y);
    }
    public static void m2() {
    // non-static member can not be referenced from static context.
    //    x=666;
        y=777;
        System.out.println(y);
    }
}