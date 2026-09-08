import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TCPClient {
    String serverName = "localhost";
    int portNumberServer = 1111;
    int portNumberClient = 2222;

    public static void main(String[] args) {
        TCPClient client = new TCPClient();
        boolean serverOnline = true;
        try {
            Socket clientSocket = new Socket(client.serverName, client.portNumberServer);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            while(!clientSocket.isClosed())
                    out.println(client.writeToServer());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    private String writeToServer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}