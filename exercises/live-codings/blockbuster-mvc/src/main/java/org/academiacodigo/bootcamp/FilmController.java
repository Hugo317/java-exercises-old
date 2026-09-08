package org.academiacodigo.bootcamp;

import java.util.List;

public class FilmController {

    private FilmService service;
    private FilmView view;

    public void start(){

        List<Film> films = service.getFilms();
        view.showFilms(films);

    }

    public void setService(FilmService service) {
        this.service = service;
    }

    public void setView(FilmView view) {
        this.view = view;
    }
}
