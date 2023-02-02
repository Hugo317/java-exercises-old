package org.academiadecodigo.arabiannights.genie;


public class GrumpyGenie extends Genie {


    public GrumpyGenie(int wishLimit) {
        super(wishLimit);
    }

    @Override
    public boolean hasWishesLeft() {
        return getGrantedWishes() == 0;
    }


    @Override
    public String toString() {

        return getGrantedWishes() == 0 ? "Grumpy genie has a wish to grant." : "Grumpy genie has granted a wish.";

    }

}
