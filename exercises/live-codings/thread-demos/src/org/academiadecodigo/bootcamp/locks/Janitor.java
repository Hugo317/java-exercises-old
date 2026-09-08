package org.academiadecodigo.bootcamp.locks;

public class Janitor implements Runnable{

    private Bathroom wc;
    private String name;

    public Janitor(String name, Bathroom wc) {
        this.wc = wc;
        this.name = name;
    }


    @Override
    public void run() {
        Thread.currentThread().setName(name);
        wc.chattingOutside();
        wc.cleanToilet();
    }
}
