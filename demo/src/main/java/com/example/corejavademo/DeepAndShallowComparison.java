package com.example.corejavademo;

public class DeepAndShallowComparison {
    int x;
    public static void main(String[] args) {
         DeepAndShallowComparison ds = new DeepAndShallowComparison();
         ds.x = 10;
         ds.m1();
        System.out.println(ds.x);


    }

    public void m1() {
        x = 20;
    }
}
