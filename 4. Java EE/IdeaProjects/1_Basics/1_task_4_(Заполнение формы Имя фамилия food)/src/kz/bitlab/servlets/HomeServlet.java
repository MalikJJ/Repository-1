package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ArrayList<User> userList = DBManager.getUserList();

        out.print("<table cellpadding = '20px' style=\"border: 2px solid lightgray;\">");
        out.print("<form action = '/adduser' method = 'post'>");
        out.print("<tr>");

        out.print("<td>");
        out.print("NAME:");
        out.print("</td>");

        out.print("<td>");
        out.print("<input type = 'text' name = 'user_name'>");
        out.print("</td>");

        out.print("</tr>");
        out.print("<tr>");

        out.print("<td>");
        out.print("SURNAME:");
        out.print("</td>");

        out.print("<td>");
        out.print("<input type = 'text' name = 'user_surname'>");
        out.print("</td>");

        out.print("</tr>");
        out.print("<tr>");

        out.print("<td>");
        out.print("FOOD:");
        out.print("</td>");

        out.print("<td>");
        out.print("<select name = 'user_orderedFood'>");
        out.print("<option></option>");
        out.print("<option>Manty - 900 KZT</option>");
        out.print("<option>Sorpa - 800 KZT</option>");
        out.print("<option>Lentil soup - 700 KZT</option>");
        out.print("</select>");
        out.print("</td>");

        out.print("</tr>");
        out.print("<tr>");

        out.print("<td>");
        out.print("<button>ORDER</button>");
        out.print("</td>");
        out.print("</tr>");
        out.print("</form>");
        out.print("</table><br><br><br>");

        for(User user : userList) {
            out.println(user.getName() + " " + user.getSurname() + " ordered " + user.getOrderedFood() + "<br><br>");
        }
    }
}
