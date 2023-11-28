package com.example.designpattern.decorator;

public class CheeseBurstDecorator extends PizzaDecorator {

    public CheeseBurstDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return addCheese() + pizza.bake();
    }

    public String addCheese() {
        return "Cheese";
    }
}
