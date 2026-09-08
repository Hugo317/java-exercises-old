package org.academiadecodigo.bootcamp.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;
import org.academiadecodigo.bootcamp.concurrency.bqueue.Pizza;

public class Main {

    public static void main(String[] args) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        BQueue<Pizza> queue= new BQueue<>(5);

        Producer p1 = new Producer(queue,10);
        Thread t1 = new Thread(p1);
        t1.setName("Dominos");

        Producer p2 = new Producer(queue,10);
        Thread t2 = new Thread(p2);
        t2.setName("PizzaHut");

        Consumer c1 = new Consumer(queue, 10);
        Thread t3 = new Thread(c1);
        t3.setName("Hugo");

        Consumer c2 = new Consumer(queue, 10);
        Thread t4 = new Thread(c2);
        t4.setName("Ricardo");

        t3.start();
        t4.start();

        t1.start();
        t2.start();

    }

}

