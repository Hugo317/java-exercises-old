package org.academiadecodigo.bootcamp.concurrency.bqueue;

import java.util.ArrayList;

/**
 * Blocking Queue
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {
    ArrayList<Pizza> queue;
    int limit;
    /**
     * Constructs a new queue with a maximum size
     * @param limit the queue size
     */
    public BQueue(int limit) {
        System.out.println("list created");
        this.limit = limit;
        queue = new ArrayList<>();
       // throw new UnsupportedOperationException();

    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     //* @param data the data to add to the queue
     */
    public synchronized void offer(Pizza pizza) {
            while (isQueueFull()){
                System.out.println("producer waiting");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("added a " + pizza.toString()+ "\n");
            System.out.println("Offer side queue size is " + getSize()+ "\n");
            queue.add(pizza);
            notifyAll();
    //throw new UnsupportedOperationException();
    }
    public boolean hasPizza(){
        if (queue.size() ==0){
            return false;
        }
        return true;
    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     * @return the data from the head of the queue
     */
    public synchronized Pizza poll() {
        while (!hasPizza()){
            System.out.println("consumer waiting" + "\n");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

            Pizza toDeliver = queue.get(0);
            queue.remove(0);
            System.out.println(Thread.currentThread().getName() + "eated a" + toDeliver.toString() + "\n");
            System.out.println("Poll side queue size is " + getSize()+ "\n");
            //throw new UnsupportedOperationException();
        notifyAll();
        return toDeliver;

    }
    public boolean isQueueFull (){
        if(queue.size() == limit) return true;
        return false;
    }

    /**
     * Gets the number of elements in the queue
     * @return the number of elements
     */
    public int getSize() {
        return queue.size();

        //throw new UnsupportedOperationException();

    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     * @return the maximum number of elements
     */
    public int getLimit() {
        return limit;
        //throw new UnsupportedOperationException();

    }

}
