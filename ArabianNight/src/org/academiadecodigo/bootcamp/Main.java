package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {


Lamp test = new Lamp(10);
Genie genie = new Genie();







Genie[] arr = new Genie[test.getMaxGenies()+3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = test.rubLamp();
        }















        for (int i = 0; i < genie.getMaxWishes() ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                arr[j].createDemon(arr[j]);
                System.out.println(arr[j].getWish());
            }

            }

        }




    }



