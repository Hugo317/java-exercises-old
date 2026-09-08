package org.academiadecodigo.bootcamp;

public class DemonGenie extends Genie{
    int maxWishes = 0;
    boolean isRecicled = false;
    String wish = "cursed wish by Demon";

    public String getWish() {
        if (isRecicled == false) {
            return wish;
        }
        else {
            return "no more wishes by Demon";
        }
    }

    public void setRecicled(boolean recicled) {
        isRecicled = recicled;
    }
}
