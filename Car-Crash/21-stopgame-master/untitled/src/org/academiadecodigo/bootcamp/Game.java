package org.academiadecodigo.bootcamp;

import java.awt.font.FontRenderContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Game implements Runnable {
    ArrayList<ArrayList<String>> answersArrays = new ArrayList<>();
    ArrayList<Client> clients;
    VAR var;
    int roundsPlayed = 0;
    int roundsToPlay = 3;
    ArrayList<ArrayList<String>> plswork;
    boolean STOPGAME = false;

    public Game(ArrayList<Client> clients) {
        this.clients = clients;
    }

    private void writeForVar(String message) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(var.socket.getOutputStream(), true);
            writer.println(message);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void writeForClients(String message) {
        PrintWriter writer = null;
        for (Client client : clients) {
            try {
                writer = new PrintWriter(client.socket.getOutputStream(), true);
                writer.println(message);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void writeForAll(String message) {
        writeForClients(message);
        writeForVar(message);
    }

    private VAR chooseVar() {

        int indexVar = (int) Math.floor(Math.random() * clients.size());
        var = new VAR(clients.get(indexVar).socket, clients.get(indexVar).name);

        clients.remove(indexVar);

        return var;
    }

    private ArrayList<ArrayList<String>> answerCheck(ArrayList<ArrayList<String>> array, String letter) {
        for (int i = 0; i < array.size(); i++) {
            //writeForVar("in for i");
            for (int j = 0; j < 4; j++) {
                //writeForVar("in for j");
                String letterCheck = (array.get(i)).get(j);
                if (!letterCheck.toLowerCase().startsWith(letter.toLowerCase())) {
                    //writeForVar("changing invalid");
                    (array.get(i)).remove(j);
                    (array.get(i)).add(j, "NotValid");
                }
                if ((letterCheck.toLowerCase().startsWith("!|!"))) {
                    writeForVar("no answer");
                    (array.get(i)).remove(j);
                    (array.get(i)).add(j, "NotAnswered");
                }
            }

        }
        return array;

    }

    private synchronized void startRound() {
        answersArrays.clear();
        writeForAll("YOU'VE PLAYED " + roundsPlayed + " GAMES!");
        var.init();

        Letter letter = Letter.randomLetter(); // ASSIGN A RANDOM LETTER FOR THIS ROUND

        writeForAll("THE CHOSEN LETTER IS " + letter + "\nGET READY");

        for (Client client : clients) { // PASSAMOS A LETRA DA RONDA PARA TODOS OS CLIENTES
            // System.out.println("rounds loop 1");
            client.setCurrentLetter(letter.toString());
            client.gameWaiting = false;
        }


        for (int i = 0; i < clients.size(); i++) { // SUPOSTA LOGICA DE PARAR QUE NAO PARA :)
            System.out.println("rounds loop 2");
            //boolean flag = clients.get(i).g;
           // writeForVar(clients.get(i).name);
            //writeForVar(i + " : index");
           // writeForVar("falgging");
            if (flag(clients.get(i))) {
                setAllisStop(true);
                break;
            }
            if (i == clients.size() - 1) {
                i = -1;
            }
        }

        for (Client client : clients) {
            answersArrays.add(client.getAnswers());
        }

        answerCheck(answersArrays, letter.toString());


        writeForClients("GOOD JOB WAIT FOR NEXT ROUND");

        for (int i = 0; i < clients.size(); i++) {
            writeForVar(((Integer) answersArrays.size()).toString());
            writeForVar("  PLAYER         COUNTRY         BRAND          CAPITAL          FOOD");
            writeForVar(clients.get(i).name + " answered: " + answersArrays.get(i).get(0) + " / "
                    + answersArrays.get(i).get(1) + " / "
                    + answersArrays.get(i).get(2) + " / "
                    + answersArrays.get(i).get(3));
            var.getScore(clients.get(i));
        }
        showScore();
        //STOPGAME = false;
    }

    private void setAllisStop(boolean bool) {

        for (Client clients : clients) { //STOPS WITH STOP FOR ALL
            clients.setStopForAll(bool);
            clients.setGameWaiting(bool);
        }
    }

    private boolean flag(Client client) {
        return client.stopForAll;
    }

    private void showScore() {
        for (Client client : clients) {
            writeForAll(client.name + " HAS " + client.getScore() + " POINTS");
        }

    }
    private void showFinalScores(){
        for (Client client : clients) {
            writeForAll(client.name + ": " + client.score);
            writeForAll("\n"+"\n"+"        THANK YOU FOR PLAYING");

        }
    }

    @Override
    public void run() {
        var = chooseVar(); // CHOSING THE VAR
        writeForAll("THE GAME IS STARTING"); // SOUT FOR ALL GAE IS STARTING

        writeForVar("YOU ARE THE VAR"); // TELL THE VAR HE IS THE VAR

        while (roundsPlayed < roundsToPlay) {
            System.out.println("inside rounds");
            startRound();
            roundsPlayed++;
        }


    }
}
