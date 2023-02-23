package org.academiadecodigo.powrangers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {


    public static void main(String[] args) {
        String urlString = "http://www.google.pt";

        try {
            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String temp;

            while ((temp = in.readLine()) != null) {
                System.out.println(temp);
            }

            in.close();

        } catch (IOException i) {
            System.out.println(i);
        }


    }

}
