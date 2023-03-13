import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Painted {
    Position position;
    Rectangle rectangle;
    Painted(int cols, int rows){
       position = new Position(cols,rows);
       rectangle = new Rectangle(Grid.padding+(cols*Grid.squareSize)+1,Grid.padding+(rows*Grid.squareSize)+1,Grid.squareSize-1,Grid.squareSize-1);
       rectangle.setColor(Color.GREEN);
       rectangle.fill();
        System.out.println("col is: " + cols);
        System.out.println("row is: " + rows);
        System.out.println("\n ================ \n");
    }

    public Position getPosition() {
        return position;
    }
}

