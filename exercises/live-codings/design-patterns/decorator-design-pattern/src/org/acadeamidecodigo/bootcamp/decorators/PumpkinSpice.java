package org.acadeamidecodigo.bootcamp.decorators;

import org.acadeamidecodigo.bootcamp.base.BaseDecorator;
import org.acadeamidecodigo.bootcamp.base.Coffee;

public class PumpkinSpice extends BaseDecorator {
    public PumpkinSpice(Coffee coffee) {
        super(coffee);
    }


    // pumpkinspice is an extra 1.20
    @Override
    public double getPrice() {
        return super.getPrice() + 1.20;
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", pumpkin spice";
    }
}
