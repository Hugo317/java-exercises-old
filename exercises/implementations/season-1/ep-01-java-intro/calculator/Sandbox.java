package org.academiadecodigo.bootcamp;

public class Sandbox {

    public static void main(String[] args) {

        Calculator c1 = new Calculator("Texas", "Rainbow");


        c1.printAllProperties();


        c1.add(2, 3);
        c1.add(2.5, 3.5);

        c1.recharge();

    }
}
