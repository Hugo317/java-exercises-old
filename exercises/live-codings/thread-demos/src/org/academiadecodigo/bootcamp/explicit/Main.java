package org.academiadecodigo.bootcamp.explicit;

public class Main {

    public static void main(String[] args) {

        Cadet cadet = new Cadet();
        cadet.run();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Cadet());
            thread.start();
        }

        System.out.println("Program....finished?");

    }
}
