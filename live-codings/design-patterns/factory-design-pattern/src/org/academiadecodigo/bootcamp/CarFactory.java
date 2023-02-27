package org.academiadecodigo.bootcamp;

public class CarFactory {



    // a factory method doesn't necessarily need to work with inheritance
    // here, I want to create the same object in a different way depending on the style of car
    public static Car createCar(CarType type){

        Car car = null;

        switch (type) {
            case SPORTS:
                car = new Car(120, "Red", 2);
                break;
            case FAMILY:
                car = new Car(60, "Black", 8);
                break;
            case STREET:
                car = new Car(90, "Grey", 4);
                break;

        }

       return car;

    }
}
