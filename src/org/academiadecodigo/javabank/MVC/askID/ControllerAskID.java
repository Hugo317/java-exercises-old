package org.academiadecodigo.javabank.MVC.askID;

import org.academiadecodigo.javabank.MVC.Interfaces.Controller;
import org.academiadecodigo.javabank.MVC.MainMenu.ControllerMainMenu;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;

public class ControllerAskID implements Controller {
    Bank bank;
    ViewAskID view;
    public ControllerAskID(Bank bank){
        this.bank= bank;
        this.view = new ViewAskID(bank);
    }
    @Override
    public void init() {
        int temp =show();

       bank.setCurrentCustomerId(temp);
       ControllerMainMenu controllerMainMenu = new ControllerMainMenu(bank);
       controllerMainMenu.init();
    }

    @Override
    public int show() {
        int temp = view.prompt();
        return temp;
    }

}
