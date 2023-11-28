package com.example.designpattern.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Pizza pizza = new JalepenoDecorator(new BasePizza());
        System.out.println(pizza.bake());

        Pizza pizza1 = new CheeseBurstDecorator(new BasePizza());
        System.out.println(pizza1.bake());
    }
}
