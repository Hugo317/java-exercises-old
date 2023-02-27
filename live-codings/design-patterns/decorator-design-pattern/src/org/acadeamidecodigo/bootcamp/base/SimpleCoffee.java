package org.acadeamidecodigo.bootcamp.base;

public class SimpleCoffee implements Coffee {
    @Override
    public double getPrice() {
        return 1.00;
    }

    @Override
    public String getDescription() {
        return "simple coffee";
    }
}
