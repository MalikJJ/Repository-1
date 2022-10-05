package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Film;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/homepage")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Film> films = DBManager.getFilms();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<title>MY FIRST JAVA EE PROJECT</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<form action = '/addfilm' method = 'post'> <br>");
        out.print("NAME : <input type = 'text' name = 'film_name'> <br>");
        out.print("DESCRIPTION : <input type = 'text' name = 'film_description'><br>");
        out.print("GENRE : <select name = 'film_genre'>");
        out.print("<option>tragedy</option>");
        out.print("<option>comedy</option>");
        out.print("<option>fantasy</option>");
        out.print("<option>drama</option>");
        out.print("<option>action</option>");
        out.print("</select><br>");
        out.print("DURATION : <input type = 'number' max = '2000' min = '0'  name = 'film_duration' value = '60'> <br>");
        out.print("YEAR : <input type = 'number' max = '2022' min = '1920'  name = 'film_year' value = '1990'><br>");
        out.print("RATING : <input type = 'text'  name = 'film_rating' value = '6.0'> <br>");
        out.print("<button>ADD FILM</button>");
        out.print("</form><br><br> ");
        out.print("<table cellpadding = '20px'> ");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>ID</th>");
        out.print("<th>NAME</th>");
        out.print("<th>DESCRIPTION</th>");
        out.print("<th>GENRE</th>");
        out.print("<th>DURATION</th>");
        out.print("<th>YEAR</th>");
        out.print("<th>RATING</th>");
        out.print("<th>DETAILS</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");

        for(Film f : films){
            out.print("<tr>");
            out.print("<td>"+f.getId()+"</td>");
            out.print("<td>"+f.getName()+"</td>");
            out.print("<td>"+f.getDescription()+"</td>");
            out.print("<td>"+f.getGenre()+"</td>");
            out.print("<td>"+f.getDuration()+"</td>");
            out.print("<td>"+f.getYear()+"</td>");
            out.print("<td>"+f.getRating()+"</td>");
            out.print("<td><a href = '#'>DETAILS</a></td>");
            out.print("</tr>");
        }
        out.print("</tbody>");
        out.print("</table>");
        out.print("</body>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
