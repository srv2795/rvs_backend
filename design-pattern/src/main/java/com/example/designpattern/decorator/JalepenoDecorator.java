package com.example.designpattern.decorator;

public class JalepenoDecorator extends PizzaDecorator {

    public JalepenoDecorator(Pizza pizza) {
        super(pizza);
    }

    public String bake() {
        return addJalepeno() + pizza.bake();
    }

    public String addJalepeno() {
        return "Jalepeno";
    }

}
