package org.academiadecodigo.bootcamp;


import org.academiadecodigo.bootcamp.utils.Controls;

public class Main {


    public static void main(String[] args) {

        MapEditor mapEditor = new MapEditor(10, 10);
        new Controls(mapEditor);

    }


}
