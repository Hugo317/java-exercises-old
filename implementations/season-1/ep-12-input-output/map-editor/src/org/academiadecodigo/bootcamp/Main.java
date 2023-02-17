package org.academiadecodigo.bootcamp;


import org.academiadecodigo.bootcamp.utils.Controls;
import org.academiadecodigo.bootcamp.utils.FileSaver;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {


    public static void main(String[] args) {

        MapEditor mapEditor = new MapEditor(10, 10);
        new Controls(mapEditor);
        Picture picture = new Picture(0, 0, FileSaver.prefix + "mario.png");
        picture.draw();

    }


}
