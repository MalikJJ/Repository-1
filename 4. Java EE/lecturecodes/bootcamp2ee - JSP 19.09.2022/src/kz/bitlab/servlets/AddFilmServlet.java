package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Film;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addfilm")
public class AddFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("film_name");
        String description = request.getParameter("film_description");
        String genre = request.getParameter("film_genre");
        int duration = Integer.parseInt(request.getParameter("film_duration"));
        int year = Integer.parseInt(request.getParameter("film_year"));
        double rating = Double.parseDouble(request.getParameter("film_rating"));

        Film film = new Film();
        film.setName(name);
        film.setDescription(description);
        film.setGenre(genre);
        film.setDuration(duration);
        film.setYear(year);
        film.setRating(rating);

        DBManager.addFilm(film);

        response.sendRedirect("/");

        //System.out.println(name + " " + description + " " + genre + " " + duration + " " + year + " " + rating);

    }
}
