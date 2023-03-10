package org.academiadecodigo.javabank.MVC.MainMenu;

import org.academiadecodigo.javabank.MVC.Interfaces.Controller;
import org.academiadecodigo.javabank.MVC.MakeDeposit.ControllerMakeDeposit;
import org.academiadecodigo.javabank.MVC.OpenAccount.ControllerOpenAccount;
import org.academiadecodigo.javabank.MVC.ViewBalance.ControllerViewBalance;
import org.academiadecodigo.javabank.MVC.askID.ViewAskID;
import org.academiadecodigo.javabank.application.UserOptions;
import org.academiadecodigo.javabank.application.operations.BalanceOperation;
import org.academiadecodigo.javabank.application.operations.NewAccountOperation;
import org.academiadecodigo.javabank.application.operations.Operation;
import org.academiadecodigo.javabank.application.operations.transaction.DepositOperation;
import org.academiadecodigo.javabank.application.operations.transaction.WithdrawOperation;
import org.academiadecodigo.javabank.domain.Bank;

import java.util.HashMap;
import java.util.Map;

public class ControllerMainMenu implements Controller {
    Bank bank;
    ViewMainMenu view;
    public ControllerMainMenu(Bank bank){
        this.bank= bank;
        this.view = new ViewMainMenu(bank);
    }
    @Override
    public void init() {
        buildControllerMap().get(show()).init();

    }

    @Override
    public int show() {
        return view.prompt();
    }
    private Map<Integer, Controller> buildControllerMap() {

        Map<Integer, Controller> map = new HashMap<>();
        map.put(UserOptions.GET_BALANCE.getOption(), new ControllerViewBalance(bank));
        map.put(UserOptions.DEPOSIT.getOption(), new ControllerMakeDeposit(bank));
        //map.put(UserOptions.WITHDRAW.getOption(), // CONTROLLER);
        map.put(UserOptions.OPEN_ACCOUNT.getOption(), new ControllerOpenAccount(bank));

        return map;
    }

}
