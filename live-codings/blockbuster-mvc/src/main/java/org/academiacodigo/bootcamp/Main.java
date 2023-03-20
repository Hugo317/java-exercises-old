package org.academiacodigo.bootcamp;



import java.util.List;

public class Main {

    public static void main(String[] args) {

        // news
        FilmService service = new FilmService();
        FilmView view = new FilmView();
        FilmController controller = new FilmController();

        // wiring
        controller.setView(view);
        controller.setService(service);

        // start the program
        controller.start();



    }
}
