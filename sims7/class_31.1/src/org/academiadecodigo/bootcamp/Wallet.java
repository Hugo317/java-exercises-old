package org.academiadecodigo.bootcamp;

 class Wallet {
     private double money;


     Wallet (double a){
        money = a;
    }

     public double getMoney() {
         return money;
     }

     public boolean setMoney(double money) {
         if (money < 0 ){
             System.out.println("you cant take " + money + " out off your wallet because you only have "
             + this.money);
             return false;
         }
         this.money = money;
         return true;
     }
 }
