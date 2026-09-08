package org.academiadecodigo.bootcamp.model.pokemon;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("normal")
public class NormalPokemon extends Pokemon {


    public void beBoring(){
        System.out.println("（ミ￣ー￣ミ）");
    }
}
