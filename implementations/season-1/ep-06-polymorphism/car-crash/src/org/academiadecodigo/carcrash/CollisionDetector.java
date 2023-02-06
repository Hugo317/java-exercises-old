package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Car;

public class CollisionDetector {

    private Car[] cars;

    public CollisionDetector(Car[] cars){
        this.cars = cars;
    }

    public void check(Car c){
        for(Car otherCar: cars) {

            if(otherCar == c){
                continue;
            }

            if(otherCar.getPos().equals(c.getPos())) {
                c.crash();
                otherCar.crash();
            }

        }
    }



}
