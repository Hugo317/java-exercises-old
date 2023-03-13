package org.academiadecodigo.simplegraphics.test;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {
    Rectangle playArea = new Rectangle(0,0,1280,720);
    Grid(){
        playArea.draw();
    }
}
