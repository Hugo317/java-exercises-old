package org.academiadecodigo.bootcamp;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.Window;

public class Main {

    public static void main(String[] args) {

        GUIScreen guiScreen = TerminalFacade.createGUIScreen();
        guiScreen.getScreen().startScreen();

        Window window = new Window("POW POW POW POW POW");
        guiScreen.showWindow(window);

        guiScreen.getScreen().stopScreen();
    }


}
