package org.academiadecodigo.bootcamp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class WebServer {


    public static final int DEFAULT_PORT = 8099;


    public static void main(String[] args) {

        WebServer webServer = new WebServer();
        webServer.serve();

    }

    private void serve() {

        // try-with-resources will auto close when the try block is exited
        try (ServerSocket serverSocket = new ServerSocket(DEFAULT_PORT)) {

            listen(serverSocket);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void listen(ServerSocket serverSocket) {

        while (true) {

            try  {

                Thread thread = new Thread(new ClientDispatcher(serverSocket.accept()));
                thread.start();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }




}
