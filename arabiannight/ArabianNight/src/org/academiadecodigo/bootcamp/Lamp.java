package org.academiadecodigo.bootcamp;

public class Lamp {
    int maxWishes = 3;
    int maxGenies;
    boolean hasDemon = false;
    private static int genieCounter;
    Lamp(int maxGenies){
        this.maxGenies = maxGenies;

    }

    public Genie rubLamp(){
        genieCounter++;
        Genie currentGenie = new FriendlyGenie();
            int temp = -1;
            temp = oddOREven();
            if (maxGenies == genieCounter){
                currentGenie = new DemonGenie();
                hasDemon = true;
            }
            if (temp == 0) {
                currentGenie  = new FriendlyGenie();
            } else if (temp == 1) {
                currentGenie = new GrumpyGenie();
            }
        return currentGenie;
    }


    public void rechargeLamp(DemonGenie demon){
        if(hasDemon){
        demon.setRecicled(true);
        demon.setWishCounter(0);
        }
    }

    public int getMaxWishes() {
        return maxWishes;
    }


    public int oddOREven(){   //   RETURNS 1 OR 0;
        int temp = 0;
        temp = (int)Math.floor(Math.random()*2);
        return temp;
    }


    public int getMaxGenies() {
        return maxGenies;
    }

}
