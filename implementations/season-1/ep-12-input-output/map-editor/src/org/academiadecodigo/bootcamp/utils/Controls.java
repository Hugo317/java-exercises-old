package org.academiadecodigo.bootcamp.utils;

import org.academiadecodigo.bootcamp.MapEditor;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {

    private Keyboard keyboard;
    private MapEditor mapeditor;

    public Controls(MapEditor mapeditor) {
        this.mapeditor = mapeditor;
        keyboard = new Keyboard(this);
        init();
    }

    // initialize keyboard events for this project
    private void init(){

        int[] keys = {
                KeyboardEvent.KEY_UP,
                KeyboardEvent.KEY_DOWN,
                KeyboardEvent.KEY_LEFT,
                KeyboardEvent.KEY_RIGHT,
                KeyboardEvent.KEY_SPACE,
                KeyboardEvent.KEY_C,
                KeyboardEvent.KEY_S,
                KeyboardEvent.KEY_L
        };

        for (int key = 0; key < keys.length; key++) {
            KeyboardEvent event = new KeyboardEvent();
            event.setKey(keys[key]);
            event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(event);
        }

        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(event);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                // move cursor up
                mapeditor.moveInDirection(MapEditor.Direction.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                // move cursor down
                mapeditor.moveInDirection(MapEditor.Direction.DOWN);
                break;
            case KeyboardEvent.KEY_LEFT:
                // move cursor left
                mapeditor.moveInDirection(MapEditor.Direction.LEFT);
                break;
            case KeyboardEvent.KEY_RIGHT:
                // move cursor right
                mapeditor.moveInDirection(MapEditor.Direction.RIGHT);
                break;
            case KeyboardEvent.KEY_SPACE:
                // pressing space
                // painting
                mapeditor.paint();
                mapeditor.setPressed(true);
                break;
            case KeyboardEvent.KEY_C:
                // clear grid
                mapeditor.clear();
                break;
            case KeyboardEvent.KEY_S:
                // save to file
                mapeditor.save();
                break;
            case KeyboardEvent.KEY_L:
                // load from file
                mapeditor.load();
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            // not pressing space anymore
            mapeditor.setPressed(false);
        }
    }
}
