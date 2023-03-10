package org.academiadecodigo.javabank.MVC.MakeDeposit;

import org.academiadecodigo.javabank.MVC.DepositAmount.ControllerDepositAmount;
import org.academiadecodigo.javabank.MVC.Interfaces.Controller;
import org.academiadecodigo.javabank.MVC.MainMenu.ControllerMainMenu;
import org.academiadecodigo.javabank.MVC.MainMenu.ViewMainMenu;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.account.Account;

public class ControllerMakeDeposit implements Controller {
    Bank bank;
    ViewMakeDeposit view;
    int accID;

    public ControllerMakeDeposit(Bank bank){
        this.bank= bank;
    }

    public void setView() {
        this.view = new ViewMakeDeposit(bank, getAccounts());
    }

    @Override
    public void init() {
        setView();
        if (bank.getCustomer(bank.getCurrentCustomerId()).getAccounts().size() == 0){
            System.out.println("Need to create a account first");
            new ControllerMainMenu(bank).init();
        } else {
         accID = show();
            System.out.println("THE ACC ID IS " + accID);
            new ControllerDepositAmount(bank,accID).init();
        }
    }

    @Override
    public int show() {
        return view.prompt();
    }
    public String getAccounts(){
        String holder = "";
        for (Account acc :bank.getCustomer(bank.getCurrentCustomerId()).getAccounts()) {
            holder += acc.getId() + " ";
        }
        return holder;
    }
}
