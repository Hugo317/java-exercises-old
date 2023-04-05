package org.academiadecodigo.bootcamp.rescue;

import org.academiadecodigo.bootcamp.rescue.pets.Cat;
import org.academiadecodigo.bootcamp.rescue.pets.Dog;
import org.academiadecodigo.bootcamp.rescue.pets.Pet;
import org.academiadecodigo.bootcamp.rescue.pets.Turtle;

public class Rescue {

    public static Pet getANewFriend(){

        double randomNum = Math.random();

        if(randomNum < 0.3) {
            return new Dog(new Toy());
        }

        if(randomNum < 0.6) {
            return new Cat(new Toy());
        }

        return new Turtle();
    }

}
