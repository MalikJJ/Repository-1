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

        out.print("<table cellpadding = '20px' margin = '20px' style=\"border: 2px solid lightgray;\">");
        out.print("<thead>");
        out.print("<tr style=\"background-color: lightgray; padding: 3px;\">");
        out.print("<th>NAME</th>");
        out.print("<th>SURNAME</th>");
        out.print("<th>DEPARTMENT</th>");
        out.print("<th>SALARY</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");

        for (User user : userList) {
            out.print("<tr>");
            out.print("<td>" + user.getName() + "</td>");
            out.print("<td>" + user.getSurname() + "</td>");
            out.print("<td>" + user.getDepartment() + "</td>");
            out.print("<td>" + user.getSalary() + "</td>");
            out.print("</tr>");
        }
        out.print("</tbody>");
        out.print("</table>");
    }
}
