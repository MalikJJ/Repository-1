package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/adduser")
public class AddUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        String orderedFood = request.getParameter("user_orderedFood");

        User user =new User();
        user.setName(name);
        user.setSurname(surname);
        user.setOrderedFood(orderedFood);

        DBManager.addUser(user);

        response.sendRedirect("/");

    }
}
