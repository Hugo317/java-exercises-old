package org.academiadecodigo.bootcamp;

public class RandomNumber {

    public static int getNumber() {

        return Math.round(Math.round(Math.ceil(Math.random() * 10)));

    }
}