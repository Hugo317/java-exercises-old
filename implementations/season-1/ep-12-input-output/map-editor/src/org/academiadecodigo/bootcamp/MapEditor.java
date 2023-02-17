package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.cells.Cell;
import org.academiadecodigo.bootcamp.cells.Cursor;
import org.academiadecodigo.bootcamp.utils.FileSaver;

public class MapEditor {

    private Grid grid;
    private FileSaver fileSaver;
    private Cursor cursor;
    private boolean isPressed;

    public enum Direction {
        UP, DOWN, LEFT, RIGHT;
    }

    public MapEditor(int cols, int rows){
        grid = new Grid(cols, rows);
        fileSaver = new FileSaver();
        cursor = new Cursor(0, 0);
    }

    public void save(){
        fileSaver.save(grid.gridToString());
    }

    public void load(){
        grid.stringToGrid(fileSaver.load());
    }


    public void clear(){
        grid.clearGrid();
    }


    public void moveInDirection(Direction direction){

        if(onLimits(direction)){
            return;
        }

        switch (direction) {
            case UP:
                cursor.moveUp();
                break;
            case DOWN:
                cursor.moveDown();
                break;
            case LEFT:
                cursor.moveLeft();
                break;
            case RIGHT:
                cursor.moveRight();
                break;
        }


        if(isPressed){
            paint();
        }

    }

    public void setPressed(boolean isPressed){
        this.isPressed = isPressed;
    }

    public boolean onLimits(Direction direction){
        return cursor.getRow() == 0 && direction == Direction.UP ||
                cursor.getRow() == grid.getRows() - 1 && direction == Direction.DOWN ||
                cursor.getCol() == 0 && direction == Direction.LEFT ||
                cursor.getCol() == grid.getCols() - 1 && direction == Direction.RIGHT;
    }

    public void paint(){
        Cell cell = grid.getCell(cursor.getCol(), cursor.getRow());
        System.out.println("painting?");
        if(cell.isPainted()){
            cell.erase();
        } else {
            cell.paint();
        }
    }
}
