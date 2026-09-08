package org.academiadecodigo.bootcamp;

public class Main {
    public static void main(String[] args) {


        Guest fausto = new Guest("Fausto",false);
        Hotel hotel1 = new Hotel("California", 30, 30);
        Hotel hotel2 = new Hotel("Pestana",50,10);
          fausto.checkIn(hotel1);
           //fausto.checkOut();
           fausto.checkIn(hotel2);



    }
    }
