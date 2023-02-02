package org.academiadecodigo.bootcamp;

public class Genie {
    public int maxWishes = 3;
    boolean activeWish;
    int wishCounter = 0;
    String wish;
    Genie(){
        maxWishes = 3;
        activeWish = true;
    }
    public int getMaxWishes() {
        return maxWishes;
    }
    public void setActiveWish(boolean activeWish) {
        this.activeWish = activeWish;
    }
    public boolean isActiveWish() {
        return activeWish;
    }

    public String getWish() {
        return wish;
    }

    public void setWishCounter(int wishCounter) {
        this.wishCounter = wishCounter;
    }

    public Genie createDemon(Genie genie){
        Genie temp = new Genie();
        if (true == true){
            temp = new DemonGenie();
        }
        return temp;
    }
}
