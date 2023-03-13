package org.academiadecodigo.bootcamp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MySever {
    ////////////// PORT 7777 //////////////////////
    ServerSocket serverSocket;
    AcceptedClients acceptedClients = new AcceptedClients();
    ArrayList<Client> clients = new ArrayList<>();
    int maxPlayers = 3; // MUDAR COM ARGUMENTOS COM MAX 11 MIN 3
    boolean isServerReady = false;

    public static void main(String[] args) {
        MySever server = new MySever();
        server.createServerSocket();

        Thread accept = new Thread(server.acceptedClients);
        accept.start();
        Game game = new Game(server.clients);
        Thread gameThread = new Thread(game);
        while (!server.isServerReady){
           System.out.println("waiting for the game to start");
        }
        System.out.println("game starting");
        gameThread.start();
    }


    private class AcceptedClients implements Runnable{

        @Override
        public void run() {

            while(!hasMaxPlayers()){

                try{

                    Socket currentClientSocket = serverSocket.accept();
                    clients.add(new Client(currentClientSocket));

                    Thread clientThread = new Thread(clients.get(clients.size()-1));//colocar cliente
                    clientThread.start();

                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
            boolean allNamesChosen = false;

            while (!allNamesChosen){

                allNamesChosen = true;

                for (Client client: clients) {

                    if(client.name == null){

                        allNamesChosen = false;
                    }
                }
            }
            isServerReady = true;
        }
    }

    private boolean hasMaxPlayers(){
        if(clients.size() == maxPlayers) return true;

        return false    ;
    }

    private ServerSocket createServerSocket(){
        try{

            serverSocket = new ServerSocket(7777);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return serverSocket;
    }
}
