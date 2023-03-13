package org.academiadecodigo.bootcamp;

public class Person {
    Wallet wallet;
    String name;
    Piggy piggy;

    Person(String name, double w, double p){
        this.name = name;
        wallet = new Wallet(w);
        piggy = new Piggy(p);
    }



    public void addPiggy (double money){
        piggy.setMoney(piggy.getMoney()+money);
        wallet.setMoney(wallet.getMoney()-money);

        System.out.println("you added " + money + " to your Piggy from your wallet!" );
    }

    public void pay (double money){
        if (money < wallet.getMoney()) {
            wallet.setMoney(wallet.getMoney()-money);
            System.out.println("You paid " + money + " for probably some stupid sh!t!");
            return;
        }
        else
            System.out.println("YOu dont have " + money +" to spend, you only have " + wallet.getMoney());
            return;

    }

    public void addWallet ( double money){
        piggy.setMoney(piggy.getMoney()-money);
        wallet.setMoney(wallet.getMoney()+money);

        System.out.println("GOOD JOB! U are fking up ur finances take a look at r/literaciafinaceira");
    }


    public void walletBalance (){
        System.out.println("you have " + wallet.getMoney() + " on your wallet, get richer pls!");
    }

    public void piggyBalance(){
        System.out.println("you have " + piggy.getMoney() + " on your piggy, dont break it!");
    }
}
