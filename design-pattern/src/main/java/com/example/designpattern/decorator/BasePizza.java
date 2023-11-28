package com.example.designpattern.decorator;

public class BasePizza implements Pizza {

    @Override
    public String bake() {
        return "Plain pizza";
    }
}
