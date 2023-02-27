package org.academiadecodigo.bootcamp.join;

public class FabricaDasCaldas {

    public static void main(String[] args) {

        System.out.println("Patrão: TOCA A TRABALHAR!!!!");
        System.out.println("Patrão: Parece que o meu trabalho está feito, vou descansar no escritório");

        Thread thread = new Thread(new TrabalhadorDasCaldas());
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Patrão: Finalmente acabou, vou trancar a fábrica");

    }


}
