package org.academiadecodigo.carcrash.field;

import static org.academiadecodigo.carcrash.field.Field.getHeight;
import static org.academiadecodigo.carcrash.field.Field.getWidth;

public class Position {
    int col = (int)Math.ceil(Math.random()*getWidth());
    int row = (int)Math.ceil(Math.random()*getHeight());





    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
