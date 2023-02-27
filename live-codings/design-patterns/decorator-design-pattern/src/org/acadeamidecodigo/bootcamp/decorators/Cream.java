package org.acadeamidecodigo.bootcamp.decorators;

import org.acadeamidecodigo.bootcamp.base.BaseDecorator;
import org.acadeamidecodigo.bootcamp.base.Coffee;

public class Cream extends BaseDecorator {

    public Cream(Coffee coffee) {
        super(coffee);
    }


    // cream is an extra 50 cents
    @Override
    public double getPrice() {
        return super.getPrice() + .50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cream";
    }
}
