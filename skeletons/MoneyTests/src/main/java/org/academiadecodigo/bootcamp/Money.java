package org.academiadecodigo.bootcamp;

public class Money {
    private final int amount;
    private final String currency;


    //Client requirements:
    //* Constructor should attribute arguments to properties.
    //* Constructor should throw an IAE if amount is negative.
    //* Constructor should throw an IAE if currency is empty.
    public Money(int amount, String currency) {

        this.amount = 0;
        this.currency = "";
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

}

