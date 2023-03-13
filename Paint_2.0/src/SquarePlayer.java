import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class SquarePlayer {
    Position position;
    Rectangle player;
    public SquarePlayer(){
        position = new Position();
        player = new Rectangle(Grid.padding,Grid.padding,
                Grid.squareSize,Grid.squareSize);
                player.fill();
    }

    public void moveUp(){
        if(position.getCurrentRow() == 0) return;
        player.translate(0,-Grid.squareSize);
        position.setCurrentRow(position.getCurrentRow()-1);
        player.delete();
        player.fill();
    }
    public void moveDown(){
        if(position.getCurrentRow() == Grid.heightInRows-1) return;
        player.translate(0,Grid.squareSize);
        position.setCurrentRow(position.getCurrentRow()+1);
        player.delete();
        player.fill();
    }
    public void moveLeft(){
        if(position.getCurrentCol() == 0) return;
        player.translate(-Grid.squareSize,0);
        position.setCurrentCol(position.getCurrentCol()-1);
        player.delete();
        player.fill();
    }
    public void moveRight(){
        if(position.getCurrentCol() == Grid.widthInCols-1) return;
        player.translate(Grid.squareSize,0);
        position.setCurrentCol(position.getCurrentCol()+1);
        player.delete();
        player.fill();
    }
}
