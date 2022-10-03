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

@WebServlet(value = "/adduser")
public class AddUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fullName = request.getParameter("user_fullName");
        int examPoints = Integer.parseInt(request.getParameter("user_examPoints"));

        User user = new User();
        user.setFullName(fullName);
        user.setExamPoints(examPoints);

        DBManager.addUser(user);

        response.sendRedirect("/");
    }
}
