package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Film;
import kz.bitlab.db.Genre;
import kz.bitlab.db.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/addfilm")
public class AddFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User currentUser = (User) request.getSession().getAttribute("currentUser");
        if(currentUser!=null) {
            ArrayList<Genre> genres = DBManager.getGenres();
            request.setAttribute("genres", genres);
            request.getRequestDispatcher("/addfilm.jsp").forward(request, response);
        }else{
            response.sendRedirect("/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User currentUser = (User) request.getSession().getAttribute("currentUser");
        if(currentUser!=null) {
            String name = request.getParameter("film_name");
            String description = request.getParameter("film_description");
            int genreId = Integer.parseInt(request.getParameter("film_genre"));
            int duration = Integer.parseInt(request.getParameter("film_duration"));
            int year = Integer.parseInt(request.getParameter("film_year"));
            double rating = Double.parseDouble(request.getParameter("film_rating"));

            Genre genre = DBManager.getGenre(genreId);

            if (genre != null) {

                Film film = new Film();
                film.setName(name);
                film.setDescription(description);
                film.setDuration(duration);
                film.setYear(year);
                film.setRating(rating);
                film.setGenre(genre);

                DBManager.addFilm(film);

                response.sendRedirect("/");

            }
        }else{
            response.sendRedirect("/login");
        }
    }
}
