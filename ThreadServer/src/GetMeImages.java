import java.io.File;
import java.io.IOException;
import java.net.Socket;

public class GetMeImages implements Runnable {
    MyServer server;
    Socket client;
    File file;


    GetMeImages(MyServer server, Socket client){
        this.server=server;
        this.client=client;
    }

    @Override
    public void run() {
        try {
            //Thread.sleep(300);
            server.out = server.getBufferedWriterWithCLientOutput(server.out,client);

            server.in = server.getBufferedReaderWithClientInput(server.in,client);

            String holder = server.in.readLine();

            System.out.println(holder);

            if (holder.contains("GET")) {

                String order = server.ReadRequestSpitsOrder(holder); // LE O QUE VEM DO HTML E COSPE ORDER "/order"

                server.file = server.fileFinder(order);


                if(server.file.exists()) { // VE SE O FILE EXISTE SE SIM GUARDA EM server.file

                    String extension = server.getExtension(server.file); // COSPE A EXTENSION DO FILE EX."png"

                    server.fileInputStream = MyServer.getFileInputStream(server.fileInputStream, server.file); // cria um inputsream do file enviado

                    byte[] byteArray = new byte[2048];

                    int num = server.fileInputStream.read(byteArray, 0, byteArray.length);

                    server.outputStream = server.getDataOutputStream(server.outputStream,client);


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


            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
