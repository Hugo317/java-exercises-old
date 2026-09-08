package org.academiadecodigo.bootcamp;

public class Main {



    /*
                TODO LIST
            3 CLASSES + MAIN
                        1 CLASS : RandomNumber (Static return math.random ... )
                        2 CLASS : GameMaster ( conduzir o projeto // criar instancias )
                        3 CLASS : Player ( ..... request things .... )

*/





    public static void main(String[] args) {

/*
        Player[] playersArray = new Player[] {
                new Player("joao"),
                new Player("hugo")

        };

        System.out.println(playersArray[0].myGuess());
        System.out.println(playersArray[1].myGuess());
*/




       Player p1 = new Player("Joao");
       Player p2 = new Player("hugo");
       GameMaster game = new GameMaster();

       game.startGame(p1,p2);


    }
}
