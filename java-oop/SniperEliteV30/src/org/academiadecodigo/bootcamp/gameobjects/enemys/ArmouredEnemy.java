package org.academiadecodigo.bootcamp.gameobjects.enemys;

import org.academiadecodigo.bootcamp.gameobjects.Shotable;

public class ArmouredEnemy extends Enemy implements Shotable {

    public ArmouredEnemy(){
        super.armor = 50;
    }

    @Override
    public String toString() {
        return "Armoured Enemy";
    }
}
