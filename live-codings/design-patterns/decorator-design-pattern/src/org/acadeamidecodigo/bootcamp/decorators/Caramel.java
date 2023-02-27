package org.acadeamidecodigo.bootcamp.decorators;

import org.acadeamidecodigo.bootcamp.base.BaseDecorator;
import org.acadeamidecodigo.bootcamp.base.Coffee;

public class Caramel extends BaseDecorator {

    public Caramel(Coffee coffee) {
        super(coffee);
    }

    // caramel is an extra 1.20
    @Override
    public double getPrice() {
        return super.getPrice() + 1.20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", caramel";
    }
}
