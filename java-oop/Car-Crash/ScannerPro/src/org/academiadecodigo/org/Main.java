package org.academiadecodigo.org;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class Main {
    public static void main(String[] args) {

    Prompt prompt = new Prompt(System.in,System.out);
        boolean goodName = false;
        String name = "";
        do{
            StringInputScanner askName = new StringInputScanner();
            askName.setMessage("What is your hero name you pussy ? \n");
            askName.setError("C'mon dont be a bitch");

            name = prompt.getUserInput(askName);
            if(name.contains(" ") || name.contains("1") || name.contains("2") || name.contains("3") ||
            name.contains("4") || name.contains("5") || name.contains("6") || name.contains("7") ||
                    name.contains("8") || name.contains("9") || name.contains("0") || name.contains("!")){
                System.out.println("That is not a valid name \n");
                continue;
            }
            goodName = true;
        }while(!goodName);
        System.out.println("nice to meet you pussy ass \n" + name);
        IntegerInputScanner askExp = new IntegerInputScanner();
        askExp.setMessage("that is the experiece u got on the road beaing beaten ?\n");
        askExp.setError("Bruv ur dumb, but not that dumb\n");
        int experienceLevel = prompt.getUserInput(askExp);

        String[] classes  = {
            "Warrior",
            "Ninja",
            "Shura",
            "Shaman"
        };

        MenuInputScanner menuInputScanner = new MenuInputScanner(classes);
        int answer = prompt.getUserInput(menuInputScanner);



}
}
