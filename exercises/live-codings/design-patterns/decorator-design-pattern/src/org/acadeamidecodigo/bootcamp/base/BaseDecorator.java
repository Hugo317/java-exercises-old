package org.acadeamidecodigo.bootcamp.base;

public abstract class BaseDecorator implements Coffee{

    private Coffee coffee;

    public BaseDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
