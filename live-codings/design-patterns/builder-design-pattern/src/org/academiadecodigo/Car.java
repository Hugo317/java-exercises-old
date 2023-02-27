package org.academiadecodigo;

public class Car {

    // a car is quite complex, with optional characteristics
    private final boolean hasSunRoof;
    private final boolean hasAC;
    private final int gears;
    private final int maxSpeed;
    private final boolean hasGPS;
    private final boolean hasRearCamera;
    private final boolean isElectric;

    public Car(CarBuilder carBuilder){
        hasSunRoof = carBuilder.hasSunRoof();
        hasAC = carBuilder.hasAC();
        gears = carBuilder.getGears();
        maxSpeed = carBuilder.getMaxSpeed();
        hasGPS = carBuilder.hasGPS();
        hasRearCamera = carBuilder.hasRearCamera();
        isElectric = carBuilder.isElectric();
    }


    // below here is all the usual car code you'd have

    public void move(){
        // move logic
        System.out.println("vroom vroom");
    }

    public void park(){
        // parking logic
        System.out.println("much parallel park");
    }


    @Override
    public String toString() {
        return "Car{" +
                "hasSunRoof=" + hasSunRoof +
                ", hasAC=" + hasAC +
                ", gears=" + gears +
                ", maxSpeed=" + maxSpeed +
                ", hasGPS=" + hasGPS +
                ", hasRearCamera=" + hasRearCamera +
                ", isElectric=" + isElectric +
                '}';
    }
}
