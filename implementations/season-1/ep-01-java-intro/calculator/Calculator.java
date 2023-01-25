package org.academiadecodigo.bootcamp;

public class Calculator {

    private String colour;
    private String brand;
    private int battery = 100;

    public Calculator(String brand, String colour){

        this.colour = colour;

        if(!brand.equals("Casio") && !brand.equals("Texas")){
            this.brand = "Chinesa";
            return;
        }
        this.brand = brand;
    }

    public int add(int n1, int n2){

        if(battery <= 0){
            System.out.println("Sorry, you must recharge your calculator!");
            // -1 is our way of saying "this method didn't work"
            return -1;
        }

        battery -= 10;
        return n1 + n2;
    }


    public double add(double n1, double n2){

        // a simpler example of a method, which isn't using the battery logic
        return n1 + n2;
    }

    public void recharge(){
        battery = 100;
    }


    public String showColour(){
        return colour;
    }

    public String showBrand(){
        return brand;
    }


    public void printAllProperties(){
        System.out.println("Colour is: " + colour);
        System.out.println("Brand is: " + brand);
        System.out.println("Battery is: " + battery);
    }
}
