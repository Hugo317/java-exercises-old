package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;

public class Client implements Runnable{
    String currentLetter;
    Socket socket;
    String name = null;
    Prompt prompt;
    volatile boolean stopForAll = false;
    ArrayList<String> roundAnswers = new ArrayList<>();
    int score = 0;
    boolean gameWaiting = true;
    boolean gameOnline = true;
    String def = "!|!notAnswered";
    String country = "!|!notAnswered";
    String brand = "!|!notAnswered";
    String capital = "!|!notAnswered";
    String food = "!|!notAnswered";

    Client (Socket socket){

        this.socket=socket;
        // METHOD GET NAME
         prompt = createPrompt();
    }

    public void setCurrentLetter(String currentLetter) {
        this.currentLetter = currentLetter;
    }

    private Prompt createPrompt(){
        try{
            prompt = new Prompt(socket.getInputStream(),new PrintStream(socket.getOutputStream()));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return prompt;
    }

    public void chooseAnswers(String roundLetter){
        roundAnswers.clear();
        country = def;
        brand = def;
        capital = def;
        food = def;
        stopForAll = false;
        StringInputScanner scanner = new StringInputScanner();
        boolean isStopped = false;

        while (!isStopped && !stopForAll) {
            String[] optionsArray = {"Country", "Brand", "Capital", "Food", "STOP"};
            MenuInputScanner menuInputScanner = new MenuInputScanner(optionsArray);
            menuInputScanner.setMessage("WHAT DO YOU WANT DO ANSWER \n" +
                                        "THE ROUND LETTER IS " + roundLetter);
            int answer = prompt.getUserInput(menuInputScanner);

            switch (answer){
                case 1:
                    if(stopForAll){
                        break;
                    }
                    scanner.setMessage("COUNTRY \n");
                    country = prompt.getUserInput(scanner);
                    break;

                case 2:
                    if(stopForAll){
                        break;
                    }
                    scanner.setMessage("BRAND \n");
                    brand = prompt.getUserInput(scanner);
                    break;

                case 3:
                    if(stopForAll){
                        break;
                    }
                    scanner.setMessage("CAPITAL \n");
                    capital = prompt.getUserInput(scanner);
                    break;

                case 4:
                    if(stopForAll){
                        break;
                    }
                    scanner.setMessage("FOOD \n");
                    food = prompt.getUserInput(scanner);
                    break;

                case 5:
                   if(food.equals(def) || capital.equals(def) || brand.equals(def) || country.equals(def)){
                        isStopped = true;
                        setGameWaiting(true);
                    } else {
                        setGameWaiting(true);
                        isStopped = true;
                        stopForAll = true;
                        System.out.println("closing round hopefully");
                        break;
                   }

            }

        }

        System.out.println("Writing for var");
    }

    public ArrayList<String> getAnswers(){
        roundAnswers.add(country);
        roundAnswers.add(brand);
        roundAnswers.add(capital);
        roundAnswers.add(food);
        return roundAnswers;
    }
    public ArrayList<String> getRoundAnswers() {
        return roundAnswers;
    }

    public boolean isStopForAll() {
        return stopForAll;
    }

    public void setStopForAll(boolean stopForAll) {
        this.stopForAll = stopForAll;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setGameWaiting(boolean gameWaiting) {
        this.gameWaiting = gameWaiting;
    }

    public void setGameOnline(boolean gameOnline) {
        this.gameOnline = gameOnline;
    }

    @Override
    public void run() {
        StringInputScanner askName = new StringInputScanner();
        askName.setMessage("whats your nickname\n");
        askName.setError("Tou must insert your Nickname\n");

        name = prompt.getUserInput(askName);
        int temp = 0;
        System.out.println("im here");
        while(gameOnline) {
            System.out.println("inside game online");
            temp++;
            while (gameWaiting) {
                temp++;
                System.out.println("inside game waiting");
            }

            chooseAnswers(currentLetter);
        }
       // System.out.println("client ended run");
    }

}
