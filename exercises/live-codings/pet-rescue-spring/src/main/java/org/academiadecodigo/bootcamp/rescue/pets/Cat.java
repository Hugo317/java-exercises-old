package org.academiadecodigo.bootcamp.rescue.pets;

import org.academiadecodigo.bootcamp.rescue.Toy;

public class Cat implements Pet{

    private Toy toy;

    public Cat(Toy toy) {
        this.toy = toy;
        System.out.println("cat created");
    }

    @Override
    public void talk() {
        System.out.println("Purrrrrrr");
    }
}
