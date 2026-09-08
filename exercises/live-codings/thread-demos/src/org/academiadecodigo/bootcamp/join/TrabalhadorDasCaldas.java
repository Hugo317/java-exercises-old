package org.academiadecodigo.bootcamp.join;

public class TrabalhadorDasCaldas implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Aqui a fazer uma loiça.....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Já não faço nem mais um caralho.");
    }
}
