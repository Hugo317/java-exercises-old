package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gameobjects.Barrel;
import org.academiadecodigo.bootcamp.gameobjects.GameObject;
import org.academiadecodigo.bootcamp.gameobjects.Tree;
import org.academiadecodigo.bootcamp.gameobjects.enemys.ArmouredEnemy;
import org.academiadecodigo.bootcamp.gameobjects.enemys.Enemy;
import org.academiadecodigo.bootcamp.gameobjects.enemys.SoldierEnemy;

public class Game {
    GameObject[] objects;
    int shotsFired;
    double treeRate = 0.05;
    int rifleDamage = 0;

    Game(int objectsNumber, int rifleDamage) {
        objects = new GameObject[objectsNumber];
        this.rifleDamage = rifleDamage;
    }
    SniperRifle sniper = new SniperRifle(rifleDamage);
    private GameObject ObjectCreator() {

        double randomGen = Math.random();

        GameObject holder = new Tree();

        if (randomGen < treeRate) {
            holder = new Tree();
        } else {
            randomGen = (int) Math.floor((Math.random() * 100));
            if (randomGen <= 50) {
                holder = new SoldierEnemy();
            }
            if (randomGen > 50 && randomGen <= 85) {
                holder = new ArmouredEnemy();
            }
            else if (randomGen > 85) {
                holder = new Barrel();
            }
        }
        return holder;
    }

    private GameObject[] ObjectArray(GameObject[] arr) {
        for (int i = 0; i < arr.length; i++) {

            arr[i] = ObjectCreator();
        }

        return arr;
    }

    private void roundOfShots() {
        for (GameObject object : objects) {

            sniper.aim(object);

            if (sniper.aimOnTree) {

                System.out.println(object.soutWhenAimed);
            }
            if (!sniper.aimOnTree) {

                if (object instanceof Barrel && !((Barrel) object).isDestroyed()) {

                    sniper.shoot((Barrel) object);
                    shotsFired++;
                }
                if (object instanceof ArmouredEnemy && !((ArmouredEnemy) object).isDead()) {

                    //System.out.println("shooting armored");
                    System.out.println(object.soutWhenAimed);
                    sniper.shoot((ArmouredEnemy) object);
                    shotsFired++;
                }
                if (object instanceof SoldierEnemy && !((SoldierEnemy) object).isDead()) {

                    //System.out.println("shooting soldier");
                    System.out.println(object.soutWhenAimed);
                    sniper.shoot((SoldierEnemy) object);
                    shotsFired++;
                } else {

                    if ((object instanceof SoldierEnemy || object instanceof ArmouredEnemy) && ((Enemy) object).isDestroyed()) {

                        System.out.println("I dont shoot dead people" +
                                "\n============================");
                    }
                    if (object instanceof Barrel && ((Barrel) object).isDestroyed()) {

                        System.out.println("this Barrel is already destroyed" +
                                "\n=============================");
                    }
                }

            }
        }
    }

    public boolean allDestroyed(GameObject[] arr) {

        boolean dead = true;

        for (GameObject object : arr) {

            sniper.aim(object);

            if (sniper.aimOnTree) {

                System.out.println(object.soutWhenAimed);
                continue;
            }
            if (!sniper.aimOnTree) {
                if (object.getClass().equals(ArmouredEnemy.class)) {

                    if (((ArmouredEnemy) object).isDead()) {
                        continue;
                    }
                }
                if (object.getClass().equals(SoldierEnemy.class)) {

                    if (((SoldierEnemy) object).isDead()) {
                        continue;
                    }
                }
                if (object.getClass().equals(Barrel.class)) {

                    if (((Barrel) object).isDestroyed()) {
                        continue;
                    }
                }
                dead = false;
            }
        }
        return dead;

    }


    public void start() {

        ObjectArray(objects);

        while (!allDestroyed(objects)) {
            roundOfShots();
        }
        System.out.println("you shot " + shotsFired + " shots");
    }


}
