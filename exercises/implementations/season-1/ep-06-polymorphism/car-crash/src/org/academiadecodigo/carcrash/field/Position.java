package org.academiadecodigo.carcrash.field;


public class Position {

    private int row;
    private int col;

    public Position() {
        setRandom();
    }

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRandom() {
        row = (int) (Math.random() * Field.getHeight());
        col = (int) (Math.random() * Field.getWidth());
    }

    public void moveDown(int distance) {
        if (this.row + distance < Field.getHeight()) {
            this.row += distance;
        } else {
            this.row = Field.getHeight() - 1;
        }
    }

    public void moveUp(int distance) {
        if (this.row - distance > 0) {
            this.row -= distance;
        } else {
            this.row = 0;
        }
    }

    public void moveLeft(int distance) {
        if (this.col - distance > 0) {
            this.col -= distance;
        } else {
            this.col = 0;
        }
    }

    public void moveRight(int distance) {

        if (this.col + distance < Field.getWidth()) {
            this.col += distance;
        } else {
            this.col = Field.getWidth() - 1;
        }
    }


    public void moveInDirection(Direction direction){

        switch(direction) {
            case UP:
                moveUp(1);
                break;
            case DOWN:
                moveDown(1);
                break;
            case RIGHT:
                moveRight(1);
                break;
            case LEFT:
                moveLeft(1);
                break;
            default:
                moveUp(1);
                break;
        }
    }


    public boolean isEdge(Direction direction) {

        return (direction == Direction.UP && row == 0) ||
                (direction == Direction.DOWN && row == Field.getHeight() - 1) ||
                (direction == Direction.LEFT && col == 0) ||
                (direction == Direction.RIGHT && col == Field.getWidth() - 1);
    }


    public boolean equals(Position position) {
        return col == position.getCol() &&
                row == position.getRow();
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
