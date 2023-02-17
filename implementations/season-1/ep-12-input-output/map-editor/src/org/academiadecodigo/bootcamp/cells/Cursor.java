package org.academiadecodigo.bootcamp.cells;


import org.academiadecodigo.bootcamp.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor {

    private Rectangle rectangle;
    private int col;
    private int row;


    public Cursor(int col, int row) {
        this.col = col;
        this.row = row;

        rectangle = new Rectangle(Grid.colToX(col), Grid.rowToY(row), Grid.CELLSIZE, Grid.CELLSIZE);
        rectangle.setColor(Color.RED);
        rectangle.fill();
    }

    public void moveUp() {

        row--;
        rectangle.translate(0, -Grid.CELLSIZE);
    }

    public void moveDown() {

        row++;
        rectangle.translate(0, Grid.CELLSIZE);
    }

    public void moveLeft() {

        col--;
        rectangle.translate(-Grid.CELLSIZE, 0);
    }

    public void moveRight() {

        col++;
        rectangle.translate(Grid.CELLSIZE, 0);

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
