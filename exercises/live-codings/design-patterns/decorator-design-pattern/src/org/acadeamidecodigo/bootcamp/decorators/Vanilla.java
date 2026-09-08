package org.acadeamidecodigo.bootcamp.decorators;

import org.acadeamidecodigo.bootcamp.base.BaseDecorator;
import org.acadeamidecodigo.bootcamp.base.Coffee;

public class Vanilla extends BaseDecorator {

    public Vanilla(Coffee coffee) {
        super(coffee);
    }


    // vanilla costs an extra 80 cents
    @Override
    public double getPrice() {
        return super.getPrice() + .80;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", vanilla";
    }
}
