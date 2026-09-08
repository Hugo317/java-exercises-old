package org.academiadecodigo.bootcamp.locks;

public class Main {

    public static void main(String[] args) {

        Bathroom wc = new Bathroom();
        Cadet c1 = new Cadet("Fanuca", wc);
        Cadet c2 = new Cadet("Rita", wc);
        Janitor janitor = new Janitor("Christina", wc);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(janitor);

        t1.start();
        t2.start();
        t3.start();



    }


}
