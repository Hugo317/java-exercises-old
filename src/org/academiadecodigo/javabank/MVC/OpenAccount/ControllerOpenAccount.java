package org.academiadecodigo.javabank.MVC.OpenAccount;

import org.academiadecodigo.javabank.MVC.Interfaces.Controller;
import org.academiadecodigo.javabank.MVC.MainMenu.ControllerMainMenu;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.account.AccountType;

public class ControllerOpenAccount implements Controller {
    Bank bank;
    ViewOpenAccount view;

    public ControllerOpenAccount(Bank bank){
        this.bank = bank;
        this.view = new ViewOpenAccount();
    }

    @Override
    public void init() {
        bank.getCustomer(bank.getCurrentCustomerId()).openAccount(AccountType.CHECKING);
        System.out.println("\n" + Messages.CREATED_ACCOUNT + bank.getCustomer(bank.getCurrentCustomerId()).getName() + " : "
                + bank.getCustomer(bank.getCurrentCustomerId()).getAccounts().size());
        new ControllerMainMenu(bank).init();

    }

    @Override
    public int show() {
        return view.prompt();
    }
}
