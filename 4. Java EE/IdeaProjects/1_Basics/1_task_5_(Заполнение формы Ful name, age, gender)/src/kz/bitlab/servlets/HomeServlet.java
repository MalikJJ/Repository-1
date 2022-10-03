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
        out.print("FULL NAME:");
        out.print("</td>");

        out.print("<td>");
        out.print("<input type = 'text' name = 'user_fullName'>");
        out.print("</td>");

        out.print("</tr>");
        out.print("<tr>");

        out.print("<td>");
        out.print("AGE:");
        out.print("</td>");

        out.print("<td>");
        out.print("<input type = 'number' name = 'user_age'>");
        out.print("</td>");

        out.print("</tr>");
        out.print("<tr>");

        out.print("<td>");
        out.print("GENDER:");
        out.print("</td>");

        out.print("<td>");
        out.print("<a><input type = 'radio' name = 'user_gender' value = 'male'>male</a><br>");
        out.print("<a><input type = 'radio' name = 'user_gender' value = 'female'>female</a>");
        out.print("</td>");

        out.print("</tr>");
        out.print("<tr>");

        out.print("<td>");
        out.print("<button>SEND</button>");
        out.print("</td>");
        out.print("</tr>");
        out.print("</form>");
        out.print("</table><br><br><br>");

//        out.print("<table cellpadding = '20px' style=\"border: 2px solid lightgray;\">");
//        out.print("<tbody>");

        out.print("<h1>");
        for (User user : userList) {
//            out.print("<tr>");
//            out.print("<td>");
            if (user.getAge() >= 18) {
                if (user.getGender().equals("male")) {
                    out.print("Hello, dear mister " + user.getFullName());
                } else out.print("Hello, dear miss " + user.getFullName());
            } else if (user.getGender().equals("male")) {
                out.print("Hello, dude mister " + user.getFullName());
            } else {
                out.print("Hello, dude miss " + user.getFullName());
            }
//            out.print("</td>");
//            out.print("</tr>");
            out.print("<br>");
        }

        out.print("</h1>");
//        out.print("</tbody>");
//        out.print("</table>");

    }
}
