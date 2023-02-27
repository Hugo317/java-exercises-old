package org.academiadecodigo.bootcamp;

public class Car {

    private int maxspeed;
    private String colour;
    private int seats;

    public Car(int maxspeed, String colour, int seats) {
        this.maxspeed = maxspeed;
        this.colour = colour;
        this.seats = seats;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public String getColour() {
        return colour;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxspeed=" + maxspeed +
                ", colour='" + colour + '\'' +
                ", seats=" + seats +
                '}';
    }
}
