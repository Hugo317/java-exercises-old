package org.academiadecodigo.javabank.MVC.Interfaces;

import org.academiadecodigo.bootcamp.Prompt;

public abstract interface View {
    public final Prompt prompt = new Prompt(System.in, System.out);
    public int prompt();
}

