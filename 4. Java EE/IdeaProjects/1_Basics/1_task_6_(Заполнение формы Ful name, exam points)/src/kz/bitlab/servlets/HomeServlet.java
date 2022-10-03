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
        out.print("EXAM POINTS:");
        out.print("</td>");

        out.print("<td>");
        out.print("<input type = 'number' name = 'user_examPoints'>");
        out.print("</td>");

        out.print("</tr>");
        out.print("<tr>");

        out.print("<td>");
        out.print("<button>SUBMIT EXAM</button>");
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
            if (user.getExamPoints() >= 90) {
                    out.print(user.getFullName() + " got \"A\" for exam!");
            } else if (user.getExamPoints() >= 75) {
                out.print(user.getFullName() + " got \"B\" for exam!");
            } else if (user.getExamPoints() >= 60) {
                out.print(user.getFullName() + " got \"C\" for exam!");
            } else if (user.getExamPoints() >= 50) {
                out.print(user.getFullName() + " got \"D\" for exam!");
            } else out.print(user.getFullName() + " got \"F\" for exam!");
//            out.print("</td>");
//            out.print("</tr>");
            out.print("<br>");
        }

        out.print("</h1>");
//        out.print("</tbody>");
//        out.print("</table>");

    }
}
