package org.acadeamidecodigo.bootcamp;

import org.acadeamidecodigo.bootcamp.base.Coffee;
import org.acadeamidecodigo.bootcamp.base.SimpleCoffee;
import org.acadeamidecodigo.bootcamp.decorators.Caramel;
import org.acadeamidecodigo.bootcamp.decorators.PumpkinSpice;
import org.acadeamidecodigo.bootcamp.decorators.Vanilla;

public class Main {


    public static void main(String[] args) {

        Coffee c1 = new Vanilla(new Caramel(new SimpleCoffee()));
        System.out.println(c1.getDescription());
        System.out.println(c1.getPrice());

        Coffee c2 = new PumpkinSpice(new SimpleCoffee());
        System.out.println(c2.getDescription());
        System.out.println(c2.getPrice());

    }
}
