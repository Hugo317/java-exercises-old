import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TCPServer {



    public static void main(String[] args) {
        String serverName = "localhost";
        int portNumberServer = 1111;
        try {
            ServerSocket serverSocket = new ServerSocket(portNumberServer);
        boolean online = true;
        Socket clientSocket = serverSocket.accept();

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String s = in.readLine();
            System.out.println(s);
        while(!s.equals("quit")){
            s = in.readLine();
            System.out.println(s);
        }
        } catch (IOException e) {
            System.out.println("error on socket");
        }

        //while (server.online){


        //  Scanner scanner = new Scanner(System.in);
        //server.infoToSend = scanner.nextLine().getBytes(StandardCharsets.UTF_8);

        //}
    }


}
