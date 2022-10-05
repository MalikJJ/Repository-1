package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Film> films = new ArrayList<>();
    private static int id = 8;

    static {
        films.add(new Film(1, "Titanic", "Film about ship and Di Caprio with Kate, who didn't gave him palce and he died", "tragedy", 1997, 210, 9.3));
        films.add(new Film(2, "Britanic", "Film about ship and Di Caprio with Kate, who didn't gave him palce and he died", "tragedy", 1997, 210, 9.3));
        films.add(new Film(3, "Olympic", "Film about ship and Olympic ship with Kate, who didn't gave him palce and he died", "tragedy", 1997, 210, 9.3));
        films.add(new Film(4, "Luisithania", "Film about ship and Brad Pitt with Kate, who didn't gave him palce and he died", "fantasy", 1997, 210, 9.3));
        films.add(new Film(5, "Costa Concordia", "Film about ship and Di Caprio with Kate, who didn't gave him palce and he died", "tragedy", 1997, 210, 9.3));
        films.add(new Film(6, "Interstellar", "Film about space and Di Caprio with Kate, who didn't gave him palce and he died", "comedy", 1997, 210, 9.3));
        films.add(new Film(7, "Inception", "Film about dreams and Di Caprio with Mol, who didn't gave him palce and he died", "fantasy", 2014, 210, 9.3));
    }

    public static ArrayList<Film> getFilms(){
        return films;
    }

    public static void addFilm(Film film){
        film.setId(id);
        id++;
        films.add(film);
    }

}
