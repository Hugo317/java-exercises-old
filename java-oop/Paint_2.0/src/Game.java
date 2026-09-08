import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.io.*;
import java.util.ArrayList;

public class Game {
    Grid grid;
    SquarePlayer player;
    MagicKeyboard keyboard;
    ArrayList<Painted> drawn = new ArrayList<>();
    Game(){
        grid = new Grid();
        player = new SquarePlayer();
        keyboard = new MagicKeyboard(player,this);
        keyboard.init();
    }

    private boolean isSaved (int cols,int rows){
        for (Painted  paintedTiles: drawn) {
            if (paintedTiles.position.getCurrentCol() == cols &&
                paintedTiles.position.getCurrentRow() == rows) {
                return true;
            }
            }
        return false;
    }

    public void drawNKeep () {
        int cols = player.position.getCurrentCol();
        int rows = player.position.getCurrentRow();
        boolean toSave;
        toSave = !isSaved(cols, rows);
        if (toSave) {
            drawn.add(new Painted(cols, rows));
        }
        if (!toSave) {
            for (int i = 0; i < drawn.size(); i++) {
                if (drawn.get(i).position.getCurrentCol() == cols &&
                        drawn.get(i).position.getCurrentRow() == rows) {
                    drawn.get(i).rectangle.delete();
                    drawn.remove(i);
                }
            }
        }
    }
    
    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/codecadet/Workspace/java-oop/Paint_2.0/src/saved.txt");
            fileWriter.write(drawn.toString());
    }

    public void load() throws IOException {
        FileReader fileReader=new FileReader("/Users/codecadet/Workspace/java-oop/Paint_2.0/src/saved.txt");
        System.out.println(fileReader.read());
    }


}
