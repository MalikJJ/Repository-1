package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Footballer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/output")
public class HomeServletOutput extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Footballer> footballers = DBManager.getFootballers();


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

//        out.print("<form action = '/addfootballer' method = 'post'> ");
//        out.print("NAME : <input type = 'text' name = 'footballer_name'><br><br>");
//        out.print("SURNAME : <input type = 'text' name = 'footballer_surname'> <br><br>");
//        out.print("CLUB : <input type = 'text' name = 'footballer_club'> <br><br>");
//        out.print("SALARY : <input type = 'number' name = 'footballer_salary'> <br><br>");
//        out.print("TRANSFER PRICE : <input type = 'number' name = 'footballer_transferPrice'> <br><br>");
//        out.print("<button>ADD FOOTBALLER</button>");
//        out.print("</form><br><br>");

        out.print("<table cellpadding = '20px'>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>ID</th>");
        out.print("<th>NAME</th>");
        out.print("<th>SURNAME</th>");
        out.print("<th>CLUB</th>");
        out.print("<th>SALARY</th>");
        out.print("<th>TRANSFER PRICE</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");

        for (Footballer f : footballers) {
            out.print("<tr>");
            out.print("<td>" + f.getId() + "</td>");
            out.print("<td>" + f.getName() + "</td>");
            out.print("<td>" + f.getSurname() + "</td>");
            out.print("<td>" + f.getClub() + "</td>");
            out.print("<td>" + f.getSalary() + "</td>");
            out.print("<td>" + f.getTransferPrice() + "</td>");
        }
        out.print("</tbody>");
        out.print("</table>");

    }
}
