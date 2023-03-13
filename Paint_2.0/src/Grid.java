import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {
    static final int widthInCols = 20;
    static final int heightInRows = 20;
    static final int squareSize = 20;
    Rectangle grid;
    static final int padding = 10;
    public Grid(){
        Rectangle grid = new Rectangle(padding,padding,squareSize*widthInCols,squareSize*widthInCols);
        createSquare();

    }

    private void createSquare(){
        for (int i = 0; i < widthInCols; i++) {
            for (int j = 0; j < widthInCols; j++) {
                new Rectangle((i*squareSize)+padding,(j*squareSize)+padding,squareSize,squareSize).draw();
            }
        }
    }






}
