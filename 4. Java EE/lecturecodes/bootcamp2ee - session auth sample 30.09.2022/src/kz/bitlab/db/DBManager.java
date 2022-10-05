package kz.bitlab.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {

    private static Connection connection;

    static {
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/bootcamp_db_2ee", "postgres", "postgres"
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Film> getFilms(){

        ArrayList<Film> films = new ArrayList<>();

        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT f.id, " +
                    "       f.name, " +
                    "       f.description, " +
                    "       f.genre_id, " +
                    "       f.year, " +
                    "       f.rating, " +
                    "       f.duration, " +
                    "       g.genre_name, " +
                    "       g.code " +
                    "FROM t_films f " +
                    "INNER JOIN t_genres g ON g.id = f.genre_id " +
                    "ORDER BY f.rating DESC, f.year DESC");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Film film = new Film();
                film.setId(resultSet.getInt("id"));
                film.setName(resultSet.getString("name"));
                film.setDescription(resultSet.getString("description"));
                film.setDuration(resultSet.getInt("duration"));
                film.setYear(resultSet.getInt("year"));
                film.setRating(resultSet.getDouble("rating"));

                Genre genre = new Genre();
                genre.setId(resultSet.getInt("genre_id"));
                genre.setName(resultSet.getString("genre_name"));
                genre.setCode(resultSet.getString("code"));
                film.setGenre(genre);

                films.add(film);
            }
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return films;
    }

    public static void addFilm(Film film){
        try{

            PreparedStatement statement = connection
                    .prepareStatement("INSERT INTO t_films (name, description, genre_id, duration, rating, year) " +
                                          "VALUES (?, ?, ?, ?, ?, ?)");

            statement.setString(1, film.getName());
            statement.setString(2, film.getDescription());
            statement.setInt(3, film.getGenre().getId());
            statement.setInt(4, film.getDuration());
            statement.setDouble(5, film.getRating());
            statement.setInt(6, film.getYear());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Film getFilm(int id){
        Film film = null;
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT f.id, " +
                    "       f.name, " +
                    "       f.description, " +
                    "       f.genre_id, " +
                    "       f.year, " +
                    "       f.rating, " +
                    "       f.duration, " +
                    "       g.genre_name, " +
                    "       g.code " +
                    "FROM t_films f " +
                    "INNER JOIN t_genres g ON g.id = f.genre_id " +
                    "WHERE f.id = ? " +
                    "ORDER BY f.rating DESC, f.year DESC");

            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                film = new Film();
                film.setId(resultSet.getInt("id"));
                film.setName(resultSet.getString("name"));
                film.setDescription(resultSet.getString("description"));
                film.setDuration(resultSet.getInt("duration"));
                film.setYear(resultSet.getInt("year"));
                film.setRating(resultSet.getDouble("rating"));

                Genre genre = new Genre();
                genre.setId(resultSet.getInt("genre_id"));
                genre.setName(resultSet.getString("genre_name"));
                genre.setCode(resultSet.getString("code"));
                film.setGenre(genre);
            }

            Genre genre = new Genre();

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return film;
    }

    public static void updateFilm(Film film){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "UPDATE t_films SET name = ?, description = ?, duration = ?, genre_id = ?, rating = ?, year = ? " +
                    "WHERE id = ?");

            statement.setString(1, film.getName());
            statement.setString(2, film.getDescription());
            statement.setInt(3, film.getDuration());
            statement.setInt(4, film.getGenre().getId());
            statement.setDouble(5, film.getRating());
            statement.setInt(6, film.getYear());
            statement.setInt(7, film.getId());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void deleteFilm(int id){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM t_films WHERE id = ?");

            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Genre> getGenres(){

        ArrayList<Genre> genres = new ArrayList<>();

        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM t_genres ORDER BY genre_name");

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Genre gen = new Genre();
                gen.setId(resultSet.getInt("id"));
                gen.setName(resultSet.getString("genre_name"));
                gen.setCode(resultSet.getString("code"));
                genres.add(gen);
            }
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return genres;
    }

    public static Genre getGenre(int id){

        Genre genre = null;

        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM t_genres WHERE id = ?");

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                genre = new Genre();
                genre.setId(resultSet.getInt("id"));
                genre.setName(resultSet.getString("genre_name"));
                genre.setCode(resultSet.getString("code"));
            }
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return genre;
    }

    public static User getUser(String email){
        User user = null;
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM users WHERE email = ?");
            statement.setString(1, email);

            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                user = new User();
                user.setId(resultSet.getLong("id"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setFullName(resultSet.getString("full_name"));
            }
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
