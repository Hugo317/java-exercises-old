package org.academiacodigo.bootcamp;

import java.util.List;

public class FilmView {


    public void showFilms(List<Film> films){

        films.forEach(System.out::println);
    }
}
