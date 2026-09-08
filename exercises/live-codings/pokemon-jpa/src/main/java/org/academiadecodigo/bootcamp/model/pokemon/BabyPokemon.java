package org.academiadecodigo.bootcamp.model.pokemon;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("baby")
public class BabyPokemon extends Pokemon{



    public void beCute(){
        System.out.println("(づ｡◕‿‿◕｡)づ");
    }
}
