package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Film> films = new ArrayList<>();
    private static int id = 8;

    static {
        films.add(new Film(1, "Titanic", "Film about ship and Di Caprio", "drama", 1997, 210, 9.3));
        films.add(new Film(2, "Britanic", "Film about ship and Di Caprio", "drama", 1997, 210, 9.3));
        films.add(new Film(3, "Olympic", "Film about ship and Olympic", "drama", 1997, 210, 9.3));
        films.add(new Film(4, "Luisithania", "Film about ship and Brad Pitt", "drama", 1997, 210, 9.3));
        films.add(new Film(5, "Costa Concordia", "Film about ship and something", "drama", 1997, 210, 9.3));
        films.add(new Film(6, "Interstellar", "Film about spaceship and someone", "comedy", 2016, 210, 9.3));
        films.add(new Film(7, "Inception", "Film about dreams and DiCaprio", "fantasy", 2014, 210, 9.3));
    }

    public static ArrayList<Film> getFilms() {
        return films;
    }

    public static void addFilm(Film film) {
        film.setId(id);
        id++;
        films.add(film);
    }

}
