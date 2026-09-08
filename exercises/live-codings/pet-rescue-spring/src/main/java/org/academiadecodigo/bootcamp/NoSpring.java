package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.rescue.PetOwner;
import org.academiadecodigo.bootcamp.rescue.Rescue;
import org.academiadecodigo.bootcamp.rescue.pets.Pet;

import java.util.LinkedList;
import java.util.List;

public class NoSpring {

    public static void main(String[] args) {

        List<Pet> pets = new LinkedList<>();
        pets.add(Rescue.getANewFriend());
        pets.add(Rescue.getANewFriend());
        pets.add(Rescue.getANewFriend());

        PetOwner petOwner = new PetOwner("Bedro");
        petOwner.setPet(pets);

        petOwner.strokePet();

    }
}
