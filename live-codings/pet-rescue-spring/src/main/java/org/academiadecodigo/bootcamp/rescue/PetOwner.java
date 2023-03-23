package org.academiadecodigo.bootcamp.rescue;

import org.academiadecodigo.bootcamp.rescue.pets.Cat;
import org.academiadecodigo.bootcamp.rescue.pets.Pet;

public class PetOwner {

    private String name;
    private Pet pet;

    public PetOwner(Pet pet, String name) {
        this.pet = pet;
        this.name = name;
        System.out.println("pet owner created");
    }

    public void strokePet(){
            pet.talk();
            System.out.println(name + ": I love my " + pet.getClass().getSimpleName());
    }
}
