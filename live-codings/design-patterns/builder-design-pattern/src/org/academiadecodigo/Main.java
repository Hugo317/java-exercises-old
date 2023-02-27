package org.academiadecodigo;

public class Main {

    public static void main(String[] args) {

        CarBuilder builder = new CarBuilder();

        // this is why each method returns a builder!
        // so I can do method chaining <3
        Car c1 = builder
                .addGears(3)
                .addSpeed(80)
                .enableAC()
                .enableRearCamera()
                .buildCar();

        // time to make a new car, reset my builder
        builder.reset();


        // same idea as above, without method chaining
        builder.addGears(6);
        builder.addSpeed(200);
        builder.enableGPS();
        builder.enableSunRoof();

        Car c2 = builder.buildCar();


        System.out.println(c1);
        System.out.println(c2);


    }
}
