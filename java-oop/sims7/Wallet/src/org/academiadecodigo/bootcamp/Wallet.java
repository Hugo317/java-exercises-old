package org.academiadecodigo.bootcamp;

public class Wallet {
    int wMoney = 0;
    Wallet (int m){
        wMoney = m;

    }

    public void payFromWallet(int money){

        wMoney = wMoney - money;

    }

    public void add2Wallet(int money){
        wMoney = wMoney + money;

    }


    public void saveFromWallet(int money){

        wMoney = wMoney - money;

    }


}
