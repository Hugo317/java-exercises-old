package org.academiadecodigo.bootcamp;

import java.util.ArrayList;

public class GM {
    static boolean win = false;
    static int GMNumber = Random.rNumber();
    static ArrayList <Player> myPlayers = new ArrayList<>();

    static int tries = 0;
    public static void startGame(int a){
        switch (a){
            case 10:
                myPlayers.add(new Player ("player 10"));
                System.out.println("\n Player 10 logged in");
            case 9:
                myPlayers.add(new Player ("player 9"));
                System.out.println("\n Player 9 logged in");
            case 8:
                myPlayers.add(new Player("player 8"));
                System.out.println("\n Player 8 logged in");
            case 7:
                myPlayers.add(new Player("player 7"));
                System.out.println("\n Player 7 logged in");
            case 6:
                myPlayers.add(new Player("player 6"));
                System.out.println("\n Player 6 logged in");
            case 5:
                myPlayers.add(new Player("player 5"));
                System.out.println("\n Player 5 logged in");
            case 4:
                myPlayers.add(new Player("player 4"));
                System.out.println("\n Player 4 logged in");
            case 3:
                myPlayers.add(new Player("player 3"));
                System.out.println("\n Player 3 logged in");
            case 2:
                myPlayers.add(new Player("player 2"));
                System.out.println("\n Player 2 logged in");
            case 1:
                myPlayers.add(new Player("player 1"));
                System.out.println("\n Player 1 logged in");
                break;
            default:
                System.out.println("you cant play without players you dumb fk!");

        }

    while (!win) {
        tries++;
        for (Player p : myPlayers) {
            if (GMNumber == p.pNumber) {
                win = true;
                System.out.println("\n YOU WON " + p.name + " CONGRADZZZ! " + "THE NUMBER WAS " + p.pNumber+ " AND IT TOOK HIM " + tries + " GUESSES!!");
            }


        }
         for (Player p : myPlayers) {
             p.getFinalNumber();
         }


    }









    }



}
