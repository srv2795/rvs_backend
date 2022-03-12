package com.example.corejavademo.facatorypattern;

public class Dell implements Laptop {
    public Dell() {
    }

    @Override
    public void specs() {
        System.out.println("I'm using Dell laptop.");
    }
}
