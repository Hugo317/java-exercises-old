package org.academiadecodigo.bootcamp;


import javax.print.attribute.standard.PagesPerMinute;

public class Game {

        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";

        MyEnum GMGuess;

        Logo myLogo = new Logo();

        public MyEnum attributeWeapon() {
        MyEnum Mytemp = null;

        int temp = Math.round(Math.round(Math.ceil(Math.random() * 3)));

        if (temp == 1) Mytemp = MyEnum.ROCK;

        if (temp == 2) Mytemp = MyEnum.SCISSORS;

        if (temp == 3) Mytemp = MyEnum.PAPER;

        return Mytemp;

    }

    public MyEnum battle(MyEnum a, MyEnum b) {
        MyEnum tmp = null;
        if (a == b)
            System.out.println(ANSI_RED + myLogo.logo_tie + ANSI_RESET);
        if (a == MyEnum.ROCK) {
            if (b == MyEnum.SCISSORS) tmp = a;
        }
        if (a == MyEnum.PAPER) {
            if (b == MyEnum.ROCK) tmp = a;
        }
        if (a == MyEnum.SCISSORS) {
            if (b == MyEnum.PAPER) tmp = a;
        }
        if (tmp == null) tmp = b;
        return tmp;

    }

    public void Solo(MyEnum a) {
        GMGuess = attributeWeapon();
        battle(a, GMGuess);
    }

    public int PvP(Player a, Player b) {
        if (a.weapon == null) a.weapon = attributeWeapon();
        if (b.weapon == null) b.weapon = attributeWeapon();

        if (a.weapon == b.weapon) {                            //// TIE
            System.out.println(ANSI_RED + myLogo.logo_tie + ANSI_RESET);
            return 0;
        }
        if (battle(a.weapon, b.weapon) == a.weapon){           /// P1 WINS
            logo(a,b);
            System.out.println(a.name.toUpperCase() + " IS THE WIIIIIIIIIIIIIIIIIINNNNNNEEERRR");
            return 0;
        }
        if (battle(a.weapon, b.weapon) == b.weapon) {          /// P2 WINS
            logo(b,a);
            System.out.println(b.name.toUpperCase() + " IS THE WIIIIIIIIIIIIIIIIIINNNNNNEEERRR");
            return 0;
        }

        return 1;


    }



    private void logo (Player winner, Player loser){
        switch (winner.weapon){
            case ROCK:
                System.out.println(ANSI_BLACK + myLogo.logo_rock + ANSI_RESET);
                System.out.println(ANSI_RED + myLogo.logo_vs + ANSI_RESET);
                break;

            case PAPER:
                System.out.println(ANSI_YELLOW + myLogo.logo_paper + ANSI_RESET);
                System.out.println(ANSI_RED + myLogo.logo_vs + ANSI_RESET);
                break;
            case SCISSORS:
                System.out.println(ANSI_BLUE + myLogo.logo_Scissors + ANSI_RESET);
                System.out.println(ANSI_RED + myLogo.logo_vs + ANSI_RESET);
                break;

        }

       switch (loser.weapon){
            case ROCK:
                System.out.println(ANSI_BLACK + myLogo.logo_rock + ANSI_RESET);
                break;
            case PAPER:
                System.out.println(ANSI_YELLOW + myLogo.logo_paper + ANSI_RESET);
                break;
           case SCISSORS:
                System.out.println(ANSI_BLUE + myLogo.logo_Scissors + ANSI_RESET);
                break;
       }
    }
}

