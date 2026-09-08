package org.academiacodigo.bootcamp;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class FilmService {

    private ConnectionManager connectionManager = new ConnectionManager();
    private Connection connection = connectionManager.getConnection();

    public List<Film> getFilms() {
        List<Film> films = new LinkedList<>();
        Statement statement = null;

        try {

            statement = connection.createStatement();
            String select = "SELECT * FROM films";
            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String date = resultSet.getString("year");
                int id = resultSet.getInt("id");
                films.add(new Film(title, id, date));
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return films;
    }

    public void addFilm(Film film) {

        PreparedStatement statement = null;

        try {

            String query = "INSERT INTO films(id, title, year) VALUES(?, ?, ?)";
            statement = connection.prepareStatement(query);

            statement.setInt(1, film.getId());
            statement.setString(2, film.getTitle());
            statement.setString(3, film.getDate());

            statement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
