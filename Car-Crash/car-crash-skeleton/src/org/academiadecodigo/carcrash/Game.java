package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Ambulance;
import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.field.Field;

public class Game {

    public static final int MANUFACTURED_CARS = 20;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }

        Field.draw(cars);

    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);

        }

    }
    private boolean crashed(Car car1, Car car2){
        boolean temp = false;
        if (car1.getPos().getCol() == car2.getPos().getCol()  // comparar posicao dos carros
                && car1.getPos().getRow() == car2.getPos().getRow()){
            temp = true;
        }
    return temp;
    }

    private void moveAllCars() {
        // crashing cars double loop
        for (int i = 0; i < cars.length; i++){
            // making the cars not compare to themselves
             for (int j = 0; j < cars.length; j++){
                 // car cant compare to itself
                 if (i == j){
                    continue;
                }
                // compare the ambulance position
                 if (crashed(cars[i],cars[j])){

                    // compare if the car is in deed an ambulance
                    if (cars[i].getClass().equals(Ambulance.class)) {

                        // if the ambulance touches a crash, set them uncrashed
                        for (int k = 0; k < cars.length ; k++) {
                            if (crashed(cars[i],cars[k])){
                                cars[k].setCrashed(false);
                            }
                        }

                        }


                    // if they meet and are not ambulances set crashed
                    else{
                        cars[i].setCrashed(true);
                        cars[j].setCrashed(true);
                    }

                }
            }
        }
        // os carros que nao estao crashados movem se uma vez
        for (Car car : cars) {
            if (!car.isCrashed()) {
                car.getNewPosition();
            }

        }

    }
}