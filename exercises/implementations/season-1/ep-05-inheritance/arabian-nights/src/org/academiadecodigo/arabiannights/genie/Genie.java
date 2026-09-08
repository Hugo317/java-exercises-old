package org.academiadecodigo.arabiannights.genie;

public class Genie {

    private int wishLimit;
    private int grantedWishes;


    Genie(int wishLimit) {
        this.wishLimit = wishLimit;
    }

    public boolean hasWishesLeft() {

        return getRemainingWishes() > 0;
    }

    public boolean grantWish() {

        if (!hasWishesLeft()) {
            return false;
        }

        this.grantedWishes++;
        System.out.println("Wish granted by " + this.getClass().getSimpleName());
        return true;

    };


    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" has granted ");
        stringBuilder.append(getGrantedWishes());
        stringBuilder.append(" and still has ");
        stringBuilder.append(getRemainingWishes());
        stringBuilder.append(" to grant.");

        return stringBuilder.toString();

    };

    private int getRemainingWishes() {
        int remaining = getWishLimit() - getGrantedWishes();
        return remaining >= 0 ? remaining : 0;
    }

    public int getWishLimit() {
        return wishLimit;
    }

    public int getGrantedWishes() {
        return grantedWishes;
    }


}
