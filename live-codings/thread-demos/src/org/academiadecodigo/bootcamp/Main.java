package org.academiadecodigo.bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times do you want to ring?");
        Integer numOfRings = scanner.nextInt();

        System.out.println("How many seconds between each ring?");
        Integer ringInterval = scanner.nextInt();

        Alarm alarm = new Alarm(numOfRings, ringInterval);
        System.out.println("Alarm program has begun!");
        alarm.start();
        System.out.println("Alarm program has ended!");


    }
}
