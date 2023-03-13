package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gameobjects.Barrel;
import org.academiadecodigo.bootcamp.gameobjects.GameObject;
import org.academiadecodigo.bootcamp.gameobjects.Shotable;
import org.academiadecodigo.bootcamp.gameobjects.Tree;
import org.academiadecodigo.bootcamp.gameobjects.enemys.ArmouredEnemy;
import org.academiadecodigo.bootcamp.gameobjects.enemys.Enemy;
import org.academiadecodigo.bootcamp.gameobjects.enemys.SoldierEnemy;

public class SniperRifle {

    int bulletDamage = 0;
    double missingChance = 0.2;
    boolean aimOnTree;
    SniperRifle(int bulletDamage){
        this.bulletDamage=bulletDamage;
    }
    SniperRifle() {
        System.out.println("This sniper has a " + (int) (missingChance * 100) + "% chance to fail a shot" +
                "\n =========START==========");
    }

    public boolean isAimOnTree() {
        return aimOnTree;
    }

    public void aim(GameObject object) {
        if (object instanceof Tree) {
            aimOnTree = true;
        } else {
            aimOnTree = false;
        }
    }


    public void shoot(Shotable enemy) {
        double randomGen = Math.random();
        Enemy holdEnemy = new ArmouredEnemy();
        // System.out.println("Inside sniperrifle.shoot, shooting enemy");
        if (randomGen < missingChance) {
            System.out.println("your shot missed, no damage done" +
                    "\n ===================");
            return;
        }
        if (randomGen >= missingChance) {
            System.out.println("Shot on target!");
            enemy.hit(bulletDamage);
            if (enemy instanceof Barrel)
                System.out.println("MASSIVE BOOM");
            if (enemy.isDestroyed() && (enemy instanceof ArmouredEnemy || enemy instanceof SoldierEnemy)) {
                System.out.println("You killed a " + enemy.toString());
                return;
            }
            if (!enemy.isDestroyed() && (enemy instanceof ArmouredEnemy) || (enemy instanceof SoldierEnemy)) {
                if (enemy instanceof SoldierEnemy) {
                    holdEnemy = (SoldierEnemy) enemy;
                    System.out.println(enemy.toString() + " has " + holdEnemy.getArmor() + " Armor and " + holdEnemy.getHealth() + " Helth");
                }
                if (enemy instanceof ArmouredEnemy) {
                    holdEnemy = (ArmouredEnemy) enemy;
                    System.out.println(enemy.toString() + " has " + holdEnemy.getArmor() + " Armor and " + holdEnemy.getHealth() + " Helth");
                }


            }
            System.out.println("==================================");


        }


    }
}
