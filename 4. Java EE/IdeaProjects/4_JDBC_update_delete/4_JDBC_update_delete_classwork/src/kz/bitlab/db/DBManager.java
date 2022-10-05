package kz.bitlab.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Period;
import java.util.ArrayList;

public class DBManager {

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/bootcamp_db_2ee", "postgres", "postgres");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Film> getFilms() {

        ArrayList<Film> films = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM t_films");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Film film = new Film();
                film.setId(resultSet.getInt("id"));
                film.setName(resultSet.getString("name"));
                film.setDescription(resultSet.getString("description"));
                film.setGenre(resultSet.getString("genre"));
                film.setDuration(resultSet.getInt("duration"));
                film.setRating(resultSet.getDouble("rating"));
                film.setYear(resultSet.getInt("year"));

                films.add(film);
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return films;
    }

    public static void addFilm(Film film) {

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO t_films (name, description, genre, duration, rating, year) " +
                    " VALUES (?, ?, ?, ?, ?, ?)");

            statement.setString(1, film.getName());
            statement.setString(2, film.getDescription());
            statement.setString(3, film.getGenre());
            statement.setInt(4, film.getDuration());
            statement.setDouble(5, film.getRating());
            statement.setInt(6, film.getYear());

            statement.executeUpdate();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Film getFilm(int id) {
        Film film = null;

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM t_films WHERE id = ?");
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                film = new Film();
                film.setId(resultSet.getInt("id"));
                film.setName(resultSet.getString("name"));
                film.setDescription(resultSet.getString("description"));
                film.setGenre(resultSet.getString("genre"));
                film.setDuration(resultSet.getInt("duration"));
                film.setRating(resultSet.getDouble("rating"));
                film.setYear(resultSet.getInt("year"));
            }

            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return film;
    }

    public static void updateFilm(Film film) {
        try {

            PreparedStatement statement = connection.prepareStatement("" +
                    "UPDATE t_films SET name = ?, description = ?, duration = ?, genre = ?, rating = ?, year = ? " +
                    "WHERE id = ?");

            statement.setString(1, film.getName());
            statement.setString(2, film.getDescription());
            statement.setInt(3, film.getDuration());
            statement.setString(4, film.getGenre());
            statement.setDouble(5, film.getRating());
            statement.setInt(6, film.getYear());
            statement.setInt(7, film.getId());

            statement.executeUpdate();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteFilm(int id) {
        try {

            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM t_films WHERE id = ?");

            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
