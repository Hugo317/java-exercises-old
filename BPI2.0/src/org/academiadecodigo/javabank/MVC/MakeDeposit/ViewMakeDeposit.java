package org.academiadecodigo.javabank.MVC.MakeDeposit;

import com.sun.xml.internal.ws.api.message.Message;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.javabank.MVC.Interfaces.Controller;
import org.academiadecodigo.javabank.MVC.Interfaces.View;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.domain.Bank;

import java.util.HashSet;

public class ViewMakeDeposit implements View {
    private Prompt prompt = new Prompt(System.in, System.out);
    Bank bank;
    String allAcc;

    ViewMakeDeposit(Bank bank, String acc) {
        this.bank = bank;
        this.allAcc = acc;
    }

    @Override
    public int prompt() {
        System.out.println(Messages.OPEN_ACCOUNTS + allAcc);
        IntegerSetInputScanner scanner = new IntegerSetInputScanner(bank.getCustomer(bank.getCurrentCustomerId()).getAccountIds());
        scanner.setMessage(Messages.CHOOSE_ACCOUNT);
        scanner.setError(Messages.ERROR_INVALID_ACCOUNT);

        return prompt.getUserInput(scanner);

    }


}
