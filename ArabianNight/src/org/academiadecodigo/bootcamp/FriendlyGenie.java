package org.academiadecodigo.bootcamp;

public class FriendlyGenie extends Genie{

    String wish = "granted by friendly";


    public String getWish() {
        if (wishCounter < maxWishes) {
            setActiveWish(false);
            wishCounter++;
            return wish;
        }
        else {
            System.out.println("i have no more wishes left im turning im summoning a demon");
        }
        return "fk genies";
    }
}
