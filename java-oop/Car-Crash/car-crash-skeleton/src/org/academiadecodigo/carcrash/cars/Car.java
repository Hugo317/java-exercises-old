package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

import static org.academiadecodigo.carcrash.field.Field.getHeight;
import static org.academiadecodigo.carcrash.field.Field.getWidth;

abstract  public class Car {
    /** The position of the car on the grid */
    int speed;
    boolean isCrashed = false;
    private Position pos;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    Car (){

        pos = new Position();

    }


    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return this.isCrashed;
    }

    public void setCrashed(boolean crashed) {
        isCrashed = crashed;
    }

    private int getDirection(){
        int positiveCheck = (int)Math.floor(Math.random()*2);
        int positiveMove;
        if (positiveCheck == 1){
            positiveMove = speed;
        }
        else {
            positiveMove = -speed;
        }
        return positiveMove;
    }

    private boolean upDown(){
        int randomCheck = (int)Math.floor(Math.random()*2);
        boolean upDown;
        if (randomCheck  == 1){
            upDown = true;
        }
        else{
            upDown = false;
        }
        return upDown;
    }

    public void getNewPosition(){
        Position newPos;
        boolean upDown = upDown();
        // ROW BORDER CHECK
        if (pos.getRow() <= 0 && upDown){
            pos.setRow(pos.getRow()+1);
        }
        if (pos.getRow() >= getHeight() && upDown){
            pos.setRow(pos.getRow()-1);
        }
        //COLUM BORDER CHECK
        if(pos.getCol() <= 0 && !upDown){
            pos.setCol(pos.getCol()+1);
        }
        if(pos.getCol() >= getWidth() && upDown){
            pos.setCol(pos.getCol()-1);
        }




        // RANDOM MOVES
        if (upDown){
            pos.setRow(pos.getRow()+getDirection());
        }
        if (!upDown){
            pos.setCol(pos.getCol()+getDirection());

        }
    }

}
