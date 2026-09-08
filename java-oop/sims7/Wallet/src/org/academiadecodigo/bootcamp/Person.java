package org.academiadecodigo.bootcamp;

public class Person {
Wallet wallet;
PiggyBank piggy;
String name;
     Person(String name, int w, int p) {
          wallet = new Wallet(w);
          piggy = new PiggyBank(p);
          this.name = name;
          walletHole();
          homeRobber();
     }

     private void homeRobber(){
          if (Math.floor(Math.random()*100) < 50){
               piggy.pMoney = 0;
               System.out.println("you got robbed of your Piggybank, you have 0 on your PiggyBank!!!! :O "+ name);
          }
}


     private void walletHole(){
          if (Math.floor(Math.random()*100) < 50) {
               wallet.wMoney = wallet.wMoney - 100;
               System.out.println("you have a hole on your wallet u lost 100 from it! " + name);
          }
     }
     public void pay (int money){
          if (money > wallet.wMoney){
               System.out.println("tas pobre bro! A tua Wallet nao tem " + money + "\n faz contas novas que so tens " + wallet.wMoney + " la na tua wallet maluco");
               return;
          }
               wallet.payFromWallet(money);
     System.out.println("you now have " + wallet.wMoney + "in your wallet \n");
}

public void save (int money){
     if (money > wallet.wMoney){
          System.out.println("tas pobre bro! A tua Wallet nao tem " + money + "\n A tua wallet so tem " +wallet.wMoney);
          return;
     }
          wallet.saveFromWallet(money);
          piggy.putP(money);
          System.out.println(name + ", you now have " + wallet.wMoney + "in you wallet and " + piggy.pMoney + "in your Piggy \n");
}

public void withdraw (int money){
     if (money > piggy.pMoney){
          System.out.println("tas pobre bro! O teu piggy nao tem " + money + "\n O teu Piggy tem " + piggy.pMoney);
          return;
     }
          wallet.add2Wallet(money);
          piggy.takeP(money);
          System.out.println(name + ", you took " + money + " from your Piggy, leaving you with " + piggy.pMoney + " on your Piggy and a total of " + wallet.wMoney + " in your wallet \n" );
}

public void walletBalance(){
     System.out.println(name + ", you have " + wallet.wMoney + " on your Wallet\n");
     }

     public void piggyBalance(){
          System.out.println(name + ", you have " + piggy.pMoney + " on your Piggy\n");
     }

public void piggyOnSP500 (int years){
     double SPPiggy = piggy.pMoney;
     for (int i = 0; i < years; i++){
          SPPiggy = SPPiggy * 1.07;
     }
     System.out.println(name + ", in " + years + " your piggy bank will be woth " + (int)SPPiggy + " WOWOW compoud intrest are insane \n");
}
     public void piggyOnSP500withDeposit (int years, int money){
          double SPPiggy = piggy.pMoney;
          for (int i = 0; i < years; i++){
               SPPiggy = SPPiggy + money;
               SPPiggy = SPPiggy * 1.07;
          }
          System.out.println(name + ", in " + years + " your piggy bank will be woth " + (int)SPPiggy + " WOWOW compoud intrest are insane\n");
     }


}
