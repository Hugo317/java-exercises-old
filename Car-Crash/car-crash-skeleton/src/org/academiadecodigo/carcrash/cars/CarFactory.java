package org.academiadecodigo.carcrash.cars;

import static org.academiadecodigo.carcrash.field.Field.getWidth;

public class CarFactory {

    public static  Car getNewCar() {
        int temp = (int)Math.ceil(Math.random()*2);
        Car car = null;
        if (temp == 2){
            car = new Ambulance();
        }
        if (temp == 1){
            car = new Seat();
        }
        return car;
    }
}
