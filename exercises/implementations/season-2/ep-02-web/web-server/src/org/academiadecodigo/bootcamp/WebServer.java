package org.academiadecodigo.bootcamp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class WebServer {

    public static final String DOCUMENT_ROOT = "www/";
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

            try (Socket browserConnection = serverSocket.accept()) {



                // Accept connections from browser
                dispatch(browserConnection);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void dispatch(Socket browserConnection) {

        // Input/Output streams to the browser
        try (BufferedReader in = new BufferedReader(new InputStreamReader(browserConnection.getInputStream()));
             DataOutputStream out = new DataOutputStream(browserConnection.getOutputStream());) {

            String requestHeader = fetchRequestHeader(in);
            System.out.println(requestHeader);

            // what happens if the request is blank?
            if(requestHeader.isBlank()){
                reply(out, HTTPHelper.BAD_REQUEST);
                return;
            }


            String request = requestHeader.split("\n")[0]; // request is first line of header
            String httpVerb = request.split(" ")[0]; // verb is the first word of request
            String resource = request.split(" ").length > 1 ? request.split(" ")[1] : null; // second word of request

            // what happens if the verb is anything other than GET?
            if(!httpVerb.equals("GET")){
                reply(out, HTTPHelper.NOT_ALLOWED);
                return;
            }

            // what happens if the resource is null?
            if(resource == null){
                reply(out, HTTPHelper.BAD_REQUEST);
                return;
            }

            String filepath = getFilePath(resource);
            // what happens if the type of file is one our server doesn't support, like gifs?
            if(!HTTPMedia.isHTML(filepath) && !HTTPMedia.isImage(filepath)){
                reply(out, HTTPHelper.UNSUPPORTED_MEDIA);
                return;
            }


            // what if the file doesn't exist?
            File file = new File(filepath);

            if (file.exists() && !file.isDirectory()) {
                reply(out, HTTPHelper.OK);
            } else {

                filepath = DOCUMENT_ROOT + "404.html";
                file = new File(filepath);


                reply(out, HTTPHelper.NOT_FOUND);
            }

            reply(out, HTTPHelper.contentType(filepath));
            reply(out, HTTPHelper.contentLength(file.length()));
            streamFile(out, file);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private String getFilePath(String resource) {

        String filePath = resource;

        if (!resource.contains(".")) {
            filePath += "/index.html";
        }

        filePath = DOCUMENT_ROOT + filePath;
        return filePath;

    }


    private void streamFile(DataOutputStream out, File file) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] buffer = new byte[1024];

        int numberOfBytesRead = 0;
        while ((numberOfBytesRead = fileInputStream.read(buffer)) != -1) {
            out.write(buffer, 0, numberOfBytesRead);
        }

        fileInputStream.close();

    }

    private void reply(DataOutputStream out, String response) throws IOException {
        out.writeBytes(response);
    }

    private String fetchRequestHeader(BufferedReader in) throws IOException {

        String line = "";
        StringBuilder builder = new StringBuilder();

        while ((line = in.readLine()) != null && !line.isEmpty()) {
            builder.append(line);
            builder.append("\n");
        }

        return builder.toString();
    }


}
