package org.academiadecodigo.bootcamp.gameobjects.enemys;

import org.academiadecodigo.bootcamp.gameobjects.GameObject;
import org.academiadecodigo.bootcamp.gameobjects.Shotable;

public abstract class Enemy extends GameObject implements Shotable {
int health = 100;
boolean isDestroyed = false;
boolean isDead = false;
int armor= 0;
Enemy(){
    super.soutWhenAimed = "Im a " + toString();
}

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public int getHealth() {
        return health;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    private boolean checkDead(){
        if(getHealth() > 0){
            setDead(false);
        }
        if (getHealth() <= 0){
            setDead(true);
            setDestroyed(true);
        }

        return isDead;
    }
    public void hit(int shot){
        int dmgLeft = 0;
        if (armor > 0){
            if(shot > this.armor) {
               // System.out.println("im here1");
                dmgLeft = shot - this.armor;
                setArmor(0);
                setHealth(getHealth()-dmgLeft);
                checkDead();
                return;
            }
            if (shot < this.armor ) {
                // System.out.println("im here2");
                setArmor(getArmor() - shot);
                return;
            }
        }
        if (this.armor == 0){
            // System.out.println("im here3");
            setHealth(getHealth()-shot);
            checkDead();
        }
    }



}

