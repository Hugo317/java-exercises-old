package org.academiadecodigo.javabank.MVC.DepositAmount;

import org.academiadecodigo.javabank.MVC.Interfaces.Controller;
import org.academiadecodigo.javabank.MVC.MainMenu.ControllerMainMenu;
import org.academiadecodigo.javabank.domain.Bank;

public class ControllerDepositAmount implements Controller {
    Bank bank;
    ViewDepositAmount view;
    int id;

    public ControllerDepositAmount(Bank bank, int id){
        this.bank = bank;
        this.id = id;
        this.view = new ViewDepositAmount();
    }
    @Override
    public void init() {
        bank.getAccountManager().deposit(id,show());
        new ControllerMainMenu(bank).init();
    }

    @Override
    public int show() {
        return view.prompt();
    }
}
