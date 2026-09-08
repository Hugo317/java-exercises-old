public class Position {
    int currentCol = 0;
    int currentRow = 0;

    Position(){

    }
    Position(int cols, int rows){
        this.currentCol = cols;
        this.currentRow = rows;
    }
    public int getCurrentCol() {
        return currentCol;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    private int getX(){
        return (currentCol*Grid.squareSize)+Grid.padding;
    }
    private int getY(){
        return (currentRow*Grid.squareSize)+Grid.padding;
    }
}
