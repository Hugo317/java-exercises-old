package org.academiadecodigo.bootcamp.locks;

public class Bathroom {

    public synchronized void useToilet() {

            System.out.println(Thread.currentThread().getName() + " entering toilet");
            System.out.println("*unzips*");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " leaving toilet");


    }

    public synchronized void cleanToilet(){

        System.out.println("Time to clean this toilet");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Oh my.");
    }


    public void chattingOutside(){
        System.out.println(Thread.currentThread().getName() + " is chatting outside of the bathroom");

    }


}
