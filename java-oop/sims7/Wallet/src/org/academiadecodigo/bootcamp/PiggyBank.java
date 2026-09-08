package org.academiadecodigo.bootcamp;

public class PiggyBank {
        int pMoney = 0;


    PiggyBank(int m) {
        pMoney = m;


    }


    public void takeP(int money){
        pMoney = pMoney - money;
    }

    public void putP (int money){
        pMoney = pMoney + money;
    }



}
