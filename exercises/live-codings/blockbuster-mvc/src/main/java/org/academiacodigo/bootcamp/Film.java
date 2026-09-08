package org.academiacodigo.bootcamp;

import java.sql.Date;

public class Film {

    private String title;
    private int id;
    private String date;

    public Film(String title, int id, String date) {
        this.title = title;
        this.id = id;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", date=" + date +
                '}';
    }
}
