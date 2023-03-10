package org.academiadecodigo.javabank.MVC.askID;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.javabank.MVC.Interfaces.View;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.domain.Bank;

public class ViewAskID implements View {
    Bank bank;
    public ViewAskID(Bank bank) {
        this.bank = bank;
    }

    public final Prompt prompt = new Prompt(System.in,System.out);

    public int prompt() {

        IntegerSetInputScanner scanner = new IntegerSetInputScanner(bank.getCustomerIds());
        scanner.setMessage(Messages.CHOOSE_CUSTOMER);
        scanner.setError(Messages.ERROR_INVALID_CUSTOMER);

        return prompt.getUserInput(scanner);
    }
}
