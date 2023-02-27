package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {


        Car familyVan = CarFactory.createCar(CarType.FAMILY);
        Car dodgeViper = CarFactory.createCar(CarType.SPORTS);
        Car someFiatOrWhatever = CarFactory.createCar(CarType.STREET);


        System.out.println(familyVan);
        System.out.println(dodgeViper);
        System.out.println(someFiatOrWhatever);
    }
}
