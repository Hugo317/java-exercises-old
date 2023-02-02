package org.academiadecodigo.arabiannights.genie;


public class RecyclableDemon extends Genie {

    private boolean recycled = false;


    public RecyclableDemon(int wishLimit) {
        super(wishLimit);
    }

    public boolean isRecycled() {
        return recycled;
    }

    public void recycle() {
        recycled = true;
    }

    @Override
    public boolean hasWishesLeft() {
        return !recycled;
    }


    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("Recyclable demon has granted ");
        stringBuilder.append(getGrantedWishes());
        stringBuilder.append(" wishes.");

        return recycled ? "Demon has been recycled" : stringBuilder.toString();
    }
}
