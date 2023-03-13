import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MagicKeyboard implements KeyboardHandler {

    private Keyboard keyboard;
    private SquarePlayer player;
    Game game;
    MagicKeyboard(SquarePlayer player, Game game){
        this.player = player;
        this.game = game;
    }


    public void init(){
        keyboard = new Keyboard(this);
        KeyboardEvent up = new KeyboardEvent();
            up.setKey(KeyboardEvent.KEY_W);
            up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
            right.setKey(KeyboardEvent.KEY_D);
            right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent left = new KeyboardEvent();
            left.setKey(KeyboardEvent.KEY_A);
            left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
            down.setKey(KeyboardEvent.KEY_S);
            down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent space = new KeyboardEvent();
            space.setKey(KeyboardEvent.KEY_SPACE);
            space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent save = new KeyboardEvent();
            save.setKey(KeyboardEvent.KEY_X);
            save.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent load = new KeyboardEvent();
            load.setKey(KeyboardEvent.KEY_C);
            load.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
        keyboard.addEventListener(space);
        keyboard.addEventListener(save);
        keyboard.addEventListener(load);
    }
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_W:
                player.moveUp();
                break;
            case KeyboardEvent.KEY_D:
                player.moveRight();
                break;
            case KeyboardEvent.KEY_A:
                player.moveLeft();
                break;
            case KeyboardEvent.KEY_S:
                player.moveDown();
                break;
            case KeyboardEvent.KEY_C:
                try {
                    game.load();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case KeyboardEvent.KEY_X:
                try {
                    game.save();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case KeyboardEvent.KEY_SPACE:
                game.drawNKeep();
                break;
        }



    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
