package org.academiadecodigo.bootcamp;

public class Main {
    public static void main(String[] args) {

   Person hugo = new Person("Hugo",1000,1000);
   Person rita = new Person("Rita",2000,10000);

       rita.pay(700000000);
       rita.withdraw(600000000);
       rita.save(100);
       rita.walletBalance();
       rita.piggyBalance();
       rita.piggyOnSP500(30);
       rita.piggyOnSP500withDeposit(40,400);






   hugo.pay(200);
   hugo.withdraw(200);
   hugo.save(200);
   hugo.walletBalance();
   hugo.piggyBalance();
   hugo.piggyOnSP500(20);
   hugo.piggyOnSP500withDeposit(40,400);
    }


    // casino
    //



}
