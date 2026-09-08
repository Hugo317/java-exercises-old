package org.academiadecodigo;

/**
 * Application entry point
 */
public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("Chris");
        Player p2 = new Player("Mia");
        Game g = new Game(3, p1, p2);


        g.start();

    }
}
