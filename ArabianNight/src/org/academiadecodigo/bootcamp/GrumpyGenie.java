package org.academiadecodigo.bootcamp;

public class GrumpyGenie extends Genie{

    String wish = "granted by Grumpy";


    public String getWish() {

        if (wishCounter == 0) {
            setActiveWish(false);
            wishCounter++;
            return wish;

        }
        else {
            return "no more wishes by Grumpy";
        }
    }






}
