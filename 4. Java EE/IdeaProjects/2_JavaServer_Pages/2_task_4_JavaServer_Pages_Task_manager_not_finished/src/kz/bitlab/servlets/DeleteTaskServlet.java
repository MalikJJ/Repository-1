package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deletetask")
public class DeleteTaskServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        int id = Integer.parseInt(request.getParameter("id"));

        DBManager.deleteTask(Integer.parseInt(request.getParameter("id")));

        response.sendRedirect("/");

//        request.getRequestDispatcher("/").forward(request, response);

//        DBManager.deleteTask(Integer.parseInt(request.getParameter("id")));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.getRequestDispatcher("/").forward(request, response);

//        int id = Integer.parseInt(request.getParameter("id"));
//
//        DBManager.deleteTask(Integer.parseInt(request.getParameter("id")));
    }
}
