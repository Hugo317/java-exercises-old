package org.academiadecodigo.javabank.MVC.OpenAccount;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.javabank.MVC.Interfaces.View;
import org.academiadecodigo.javabank.domain.Bank;

public class ViewOpenAccount implements View {
    private Prompt prompt = new Prompt(System.in,System.out);

    Bank bank;

    @Override
    public int prompt() {
        return 0;
    }
}
