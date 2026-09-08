package org.academiadecodigo.javabank.MVC.MainMenu;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.MVC.Interfaces.View;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.application.UserOptions;
import org.academiadecodigo.javabank.domain.Bank;

public class ViewMainMenu implements View {
    private Prompt prompt = new Prompt(System.in,System.out);
    private Bank bank;
    ViewMainMenu(Bank bank){
     this.bank = bank;
    }

    @Override
    public int prompt() {
        MenuInputScanner mainMenu = new MenuInputScanner(UserOptions.getMessages());
        mainMenu.setError(Messages.ERROR_INVALID_OPTION);
        mainMenu.setMessage(Messages.MENU_WELCOME);

        return prompt.getUserInput(mainMenu);
    }
}
