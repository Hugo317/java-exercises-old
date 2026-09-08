package org.academiadecodigo.bootcamp.explicit;

public class Cadet implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " says: POW POW POW POW POW!!!!!");
    }
}
