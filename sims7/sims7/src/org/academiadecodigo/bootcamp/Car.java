package org.academiadecodigo.bootcamp;

public class Car {

    private String colour;
    private String brand;
    private String engine;
    private String fuelType;
    private int weight = 0;
    private int originalHP = 0;
    int topSpeed = 0;
    int checkFails = 0;
    int horsePower = 0;
    int fuelP = 0;

    public Car(String cor){
        colour = cor;
    }

    public Car(String cor, String marca){
        colour = cor;
        brand = marca;
    }

    public Car(String cor, String marca, String motor){
        colour = cor;
        brand = marca;
        engine = motor;
    }

    public Car(String cor, String marca, String motor, String combustivel){
        colour = cor;
        brand = marca;
        engine = motor;
        fuelType = combustivel;
    }
    public Car(String cor, String marca, String motor, String combustivel, int peso){
        colour = cor;
        brand = marca;
        engine = motor;
        fuelType = combustivel;
        weight = peso;
    }
    public Car(String cor, String marca, String motor, String combustivel, int peso, int cavalos){
        colour = cor;
        brand = marca;
        engine = motor;
        fuelType = combustivel;
        weight = peso;
        originalHP = cavalos;
    }

    public void upgrade(int a) {

        if (colour == null) {
            System.out.println("please chose a colour");
            checkFails++;
        }
        if (brand == null) {
            System.out.println("please chose the brand of your car");
            checkFails++;
        }

        if (engine == null) {
            System.out.println("please chose the size of your engine");
            checkFails++;
        }
        if (fuelType == null) {
            System.out.println("please chose your fuel type (Gas or Petrol)");
            checkFails++;
        }
        if (!fuelType.equals("Petrol") && !fuelType.equals("Gas")) {
            System.out.println("the only types of fuel allowed are Petrol or Gas");
            checkFails++;
        }
        if (weight < 800) {
            System.out.println("your car is under 800kg!? We dont check go kars here...");
            checkFails++;
        }
        if (originalHP < 75) {
            System.out.println("we dont do nanny scooters, sry! you need more horse power");
            checkFails++;
        }

        if (originalHP > 600) {
            System.out.println("you have too many horse power as it is, go slay some tyres for me");
        }
        if (a < 200) {
            System.out.println("bro, you really wanna pay less then 200 to your mechanic!? that aint safe");
            checkFails++;
        }
        if (a >= 200 && a < 450 && checkFails == 0) {
            System.out.println("allrigth that will get you somewhere!");
        }
        if (a >= 450 && a < 650 && checkFails == 0) {
            System.out.println("u.u that will be a nice upgrade");
        }
        if (a >= 650 && a < 1000 && checkFails == 0) {
            System.out.println("ill do my best! that a lot of money of a upgrade");
        }
        if (a > 1000) {
            System.out.println("that is way too much money, that max ill do is 1k!");
            checkFails++;
        }

        if (checkFails == 0) {
            if (fuelType.equals("Gas")) {
                fuelP = 10;
            } else {
                fuelP = 8;
            }

            topSpeed = fuelP * (a / 35) - (weight / 100);
            horsePower = fuelP / 10 * (originalHP) + a / 19;

            System.out.println("With " + a + " dollars, your " + colour+ " " + brand + " will leave our shop with " + horsePower + " wheel horse power and the top speed of " + topSpeed +"MPH");


        }

    }

    public void oilChange(int b){
            if (b >= (originalHP / 2)) {
                System.out.println("that is enough for a oil change, it only costs " + originalHP/2);
            }
            if (b < originalHP/2 ){
                System.out.println("the only 3 places you dont cheep out is in food doctors and mechanics you idiot! the cost is "+ originalHP + "+ 10 euro douchebag charge");
            }
        }


    public void paintMyCar(String newColour){
        colour = newColour;
        System.out.println("the new colour of your " + brand + " is " + colour);
    }



















}




