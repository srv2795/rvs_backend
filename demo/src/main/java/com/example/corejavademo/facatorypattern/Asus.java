package com.example.corejavademo.facatorypattern;

public class Asus implements Laptop {
    public Asus() {
    }

    @Override
    public void specs() {
        System.out.println("I'm using Asus laptop.");
    }
}
