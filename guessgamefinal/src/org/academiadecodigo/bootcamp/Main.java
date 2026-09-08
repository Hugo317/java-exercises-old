package org.academiadecodigo.bootcamp;


public class Main {

    public class Names {
        public final static String PLAYER_ONE = "Joao";
        public final static String PLAYER_TWO = "Hugo";

    }


    public static void main(String[] args) {

    Player one = new Player(Names.PLAYER_ONE);
    Player two = new Player(Names.PLAYER_TWO, MyEnum.ROCK);


    Game newGame = new Game();

    newGame.PvP(one,two);

        //newGame.battle(MyEnum.SCISSORS, MyEnum.ROCK);
        //newGame.Solo(MyEnum.ROCK);


    }
}
