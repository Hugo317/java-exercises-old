import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String host = getHost();
            InetAddress adress = InetAddress.getByName(host);
            System.out.println("testing reachability for " + adress.getHostAddress() + " : " + adress.getHostAddress());
            System.out.println(adress.isReachable(3000));

        } catch (IOException e) {
            System.out.println("I fked up!");
        }
    }

        private static String getHost(){
            Scanner read = new Scanner(System.in);
            System.out.println("Host?");
            return read.nextLine();
        }





}
