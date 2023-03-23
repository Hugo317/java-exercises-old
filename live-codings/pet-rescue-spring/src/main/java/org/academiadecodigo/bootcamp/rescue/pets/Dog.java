package org.academiadecodigo.bootcamp.rescue.pets;

import org.academiadecodigo.bootcamp.rescue.Toy;

public class Dog implements Pet{

    private Toy toy;

    public Dog(Toy toy) {
        System.out.println("dog created");
        this.toy = toy;
    }


    @Override
    public void talk() {
        System.out.println("woof woof!");
    }
}
