import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UDPServer {
    DatagramSocket socket;
    boolean running;
    byte[] recivedInfo = new byte[1024];
    public static void main(String[] args) {

     UDPServer server = new UDPServer();

        try {
            server.socket = new DatagramSocket(3179);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
        server.run();∞
    }

    public void run (){
        while(true){
            DatagramPacket packetRecived = new DatagramPacket(recivedInfo, recivedInfo.length);
        try{
            socket.receive(packetRecived);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        InetAddress address = packetRecived.getAddress();
        int port = packetRecived.getPort();

        String recived = new String(packetRecived.getData(),0, packetRecived.getLength()).toUpperCase();
        byte[] arr = recived.getBytes(StandardCharsets.UTF_8);
        DatagramPacket toSend = new DatagramPacket(arr, arr.length,address,port);
        try{
            socket.send(toSend);
            System.out.println(recived);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        socket.close();
        }

    }
}