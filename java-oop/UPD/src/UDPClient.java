import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.security.UnresolvedPermission;
import java.util.Scanner;

public class UDPClient {
    String hostName = "localHost";
    //int portNumber = 6666;
    DatagramSocket socket;
    InetAddress address;
    byte[] recivedInfo = new byte[1024];
    byte[] sendInfo = new byte[1024];

    public static void main(String[] args) throws UnknownHostException {
        UDPClient client = new UDPClient();
        String host = getHost();
        int port = getPort();
        client.address = InetAddress.getByName(host);
        try {
            client.socket = new DatagramSocket();
            System.out.println("Created a socket :)");
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
        client.sendInfo = getString().getBytes(StandardCharsets.UTF_8);
        DatagramPacket infoToSend = new DatagramPacket(client.sendInfo, client.sendInfo.length, InetAddress.getByName(client.hostName), port);
        try {
            System.out.println("Sending info....");
            client.socket.send(infoToSend);
            System.out.println("Info sent!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        DatagramPacket recived = new DatagramPacket(client.recivedInfo, client.recivedInfo.length);
        try{
            client.socket.receive(recived);
        }   catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        String recivedString = new String(recived.getData());//,0, recived.getLength());
        System.out.println(recivedString);


    }


    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("to upper case string");
        return scanner.next();
    }

    private static String getHost() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Host name");
        return scanner.nextLine();
    }


    private static int getPort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Port number");
        return Integer.parseInt(scanner.nextLine());
    }


}




  /*  String hostName = args[0];
    int portNumber = Integer.parseInt(args[1]);

    // STEP2: Create send and receive buffers
    byte[] sendBuffer = new byte[1024];
    byte[] recvBuffer = new byte[1024];

    // STEP3: Open a UDP (datagram) socket
    DatagramSocket socket = new DatagramSocket(portNumber);

    // STEP4.1: Create and receive UDP datagram packet from the socket
    DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
socket.receive(receivePacket); // blocks while packet not received

// STEP4.2: Create and send UDP datagram packet from the socket
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer,
        sendBuffer.length, InetAddress.getByName(hostName), portNumber);
        socket.send(sendPacket);

// STEP5: Close the socket
        socket.close();*/