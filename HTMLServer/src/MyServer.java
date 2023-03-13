import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class MyServer {
    BufferedReader in;
    BufferedWriter out;
    ServerSocket serverSocket;
    Socket client;
    File file;
    FileInputStream fileInputStream;
    DataOutputStream outputStream;
    public BufferedReader getBufferedReaderWithClientInput (BufferedReader bufferedReader, Socket client){
        try{
            bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return bufferedReader;
    }
    public BufferedWriter getBufferedWriterWithCLientOutput(BufferedWriter bufferedWriter, Socket client){
        try{
            bufferedWriter = new BufferedWriter(new PrintWriter(client.getOutputStream(), true));
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return bufferedWriter;
    }

    public String ReadRequestSpitsOrder(String request){
        String order = request.split(" ")[1];
        System.out.println(order);
        return order;
    }
    public File fileFinder (String order) {
        //order vem em formato String "/order"
        order = order.substring(1);
        return file = new File("resources/" + order);
    }
    public String getExtension (File file){
        String name = file.getName();
        String extension = name.substring(name.indexOf(".")+1);
        return extension;
    }

    public static FileInputStream getFileInputStream(FileInputStream fileInputStream,File file) {
        try{
            fileInputStream = new FileInputStream(file);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return fileInputStream;
    }
    public DataOutputStream getDataOutputStream (DataOutputStream dataOutputStream, Socket client){
        try{
            outputStream = new DataOutputStream(client.getOutputStream());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return outputStream;
    }
    public byte[] getImageHeader(long fileLength, String extension){
        return ("HTTP/1.0 200 Document Follows \r\n" +
                "Content-Type: image/"+ extension +" \r\n" +
                "Content-Length: " + (int)fileLength + " \r\n" +
                "\r\n").getBytes(StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        MyServer server = new MyServer();

        Socket client;

        int port = 3179;



        try {
            server.serverSocket = server.getServerSocket(server.serverSocket,port);
            server.client = server.serverSocket.accept();


            server.out = server.getBufferedWriterWithCLientOutput(server.out,server.client);

            server.in = server.getBufferedReaderWithClientInput(server.in,server.client);

            String holder = server.in.readLine();

            System.out.println(holder);

            if (holder.contains("GET")) {

                String order = server.ReadRequestSpitsOrder(holder); // LE O QUE VEM DO HTML E COSPE ORDER "/order"

                server.file = server.fileFinder(order);
                if(server.file.exists()) { // VE SE O FILE EXISTE SE SIM GUARDA EM server.file

                    String extension = server.getExtension(server.file); // COSPE A EXTENSION DO FILE EX."png"

                    server.fileInputStream = getFileInputStream(server.fileInputStream, server.file); // cria um inputsream do file enviado

                    byte[] byteArray = new byte[2048];

                    int num = server.fileInputStream.read(byteArray, 0, byteArray.length);

                    server.outputStream = server.getDataOutputStream(server.outputStream,server.client);


                    if(extension.equals("png") || extension.equals("jpg")){

                        server.outputStream.write(server.getImageHeader(server.file.length(),extension));
                        server.outputStream.write(byteArray);

                        while (num != -1) {
                            num = server.fileInputStream.read(byteArray, 0, byteArray.length);
                            server.outputStream.write(byteArray, 0, byteArray.length);
                        }




                    }
                    else {
                        String errorHeader =
                                "HTTP/1.0 404 Not Found"+
                                        "Content-Type: text/html; charset=UTF-8\r\n"+
                                        "Content-Length: <file_byte_size> \r\n"+
                                        "\r\n";
                    }
              /*  out.write("HTTP/1.0 200 Document Follows \r\n" +
                        "Content-Type: image/png \r\n" +
                        "Content-Length: " + file.length() + " \r\n" +
                        "\r\n");*/




                }

                server.client.close();

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    public ServerSocket getServerSocket(ServerSocket serverSocket, int port) {

        try {
            serverSocket =new ServerSocket(port);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return serverSocket;
    }


}



