package com.example.designpattern.builder;

public class PhoneBuilder {

    private String brand;
    private int ram;
    private String os;
    private float screenSize;

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setScreenSize(float screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Phone getPhone() {
        return new Phone(brand, ram, os, screenSize);
    }
}
