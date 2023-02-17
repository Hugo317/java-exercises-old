package org.academiadecodigo.bootcamp.utils;

import java.io.*;

public class FileSaver {

    // change this to "" before running the build!
    private String prefix = "resources/";


    public void save(String gridToText){

        // try - with - resources
        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(prefix + "savefile.txt"))){

            bWriter.write(gridToText);
            bWriter.flush();
        } catch (IOException e){
            e.printStackTrace();
        }

    }


    public String load(){

        String result = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(prefix + "savefile.txt"))){
            result = reader.readLine();
        }  catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
