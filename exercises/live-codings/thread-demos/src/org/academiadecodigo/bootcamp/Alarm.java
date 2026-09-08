package org.academiadecodigo.bootcamp;

import java.util.Timer;
import java.util.TimerTask;

public class Alarm {

    private Integer numRings;
    private Integer ringInterval;
    private Timer timer;

    public Alarm(Integer numRings, Integer ringInterval) {
        this.numRings = numRings;
        this.ringInterval = ringInterval;
    }

    public void start(){
        timer = new Timer();
        timer.scheduleAtFixedRate(new Ring(), 0, ringInterval * 1000);
    }

    private class Ring extends TimerTask {

        @Override
        public void run() {
            System.out.println("RING RING!!!!!!!!!! WAKE UP!!!!!!");
            numRings--;

            if(numRings == 0){
                timer.cancel();
            }
        }
    }
}
