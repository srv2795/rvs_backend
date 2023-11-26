package com.example.designpattern.builder;

import lombok.ToString;

@ToString
public class Phone {

    private String brand;
    private int ram;
    private String os;
    private float screenSize;

    public Phone(String brand, int ram, String os, float screenSize) {
        this.brand = brand;
        this.ram = ram;
        this.os = os;
        this.screenSize = screenSize;
    }
}
