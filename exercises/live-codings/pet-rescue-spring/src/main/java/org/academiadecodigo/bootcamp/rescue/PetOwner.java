package org.academiadecodigo.bootcamp.rescue;

import org.academiadecodigo.bootcamp.rescue.pets.Cat;
import org.academiadecodigo.bootcamp.rescue.pets.Pet;

import java.util.List;

public class PetOwner {

    private String name;
    private List<Pet> pets;

    public PetOwner(String name) {
        this.name = name;
        System.out.println("pet owner created");
    }

    public void setPet(List<Pet> pet) {
        this.pets = pet;
    }

    public void strokePet(){
        pets.forEach(pet -> {
            pet.talk();
            System.out.println(name + ": I love my " + pet.getClass().getSimpleName());
        });
    }
}
