package org.academiadecodigo.bootcamp.rescue.pets;

public class Turtle implements Pet {

    public Turtle() {
        System.out.println("turtle was created!");
    }

    @Override
    public void talk() {
        System.out.println("cowabunga duuuuuuuuude");
    }
}
