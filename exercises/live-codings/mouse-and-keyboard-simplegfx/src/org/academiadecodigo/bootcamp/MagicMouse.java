package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class MagicMouse implements MouseHandler {

    private Mouse mouse;

    public void init(){
        mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        mouse.addEventListener(MouseEventType.MOUSE_MOVED);
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("Click happened at x: " + mouseEvent.getX());
        System.out.println("Click happened at y: " + mouseEvent.getY());
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

        System.out.println("Move happened at x: " + mouseEvent.getX());
        System.out.println("Move happened at y:" + mouseEvent.getX());
    }
}
