package org.academiadecodigo;

public class CarBuilder {

    private boolean hasSunRoof;
    private boolean hasAC;
    private int gears;
    private int maxSpeed;
    private boolean hasGPS;
    private boolean hasRearCamera;
    private boolean isElectric;

    public Car buildCar(){
        return new Car(this);
    }

    public void reset(){
        hasSunRoof = false;
        hasAC = false;
        gears = 0;
        maxSpeed = 0;
        hasGPS = false;
        hasRearCamera = false;
        isElectric = false;
    }

    // why are we returning "this" ? check out the main to see why! :)
    public CarBuilder addGears(int gears){
        this.gears = gears;
        return this;
    }

    public CarBuilder addSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
        return this;
    }

    public CarBuilder enableGPS(){
        this.hasGPS = true;
        return this;
    }

    public CarBuilder makeElectric(){
        this.isElectric = true;
        return this;
    }

    public CarBuilder enableRearCamera(){
        this.hasRearCamera = true;
        return this;
    }

    public CarBuilder enableAC(){
        this.hasAC = true;
        return this;
    }

    public CarBuilder enableSunRoof(){
        this.hasSunRoof = true;
        return this;
    }

    public boolean hasSunRoof() {
        return hasSunRoof;
    }

    public boolean hasAC() {
        return hasAC;
    }

    public int getGears() {
        return gears;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public boolean hasRearCamera() {
        return hasRearCamera;
    }

    public boolean isElectric() {
        return isElectric;
    }
}
