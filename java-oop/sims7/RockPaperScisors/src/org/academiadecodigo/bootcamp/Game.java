package org.academiadecodigo.bootcamp;

public class Game {

    symbol GMsymbol;

    private symbol getSymbol(){
        int temp = (int)Math.ceil(Math.random()*3);
        symbol temp2;
        if(temp == 1){
            temp2 = symbol.SCISOR;
        }
        if(temp == 2){
            temp2 = symbol.ROCK;
        }
        if(temp == 3){
            temp2 = symbol.PAPER;
        }
        return temp2;
    }




    private enum symbol {
    SCISOR,
    ROCK,
    PAPER
    }






    public void start(symbol a){
        switch{
            case symbol.SCISOR
                if
        }
    }

}
