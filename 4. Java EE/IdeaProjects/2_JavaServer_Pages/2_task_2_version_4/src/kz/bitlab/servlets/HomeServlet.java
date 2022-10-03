package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        ArrayList<Item> items = DBManager.getItems();
//        request.setAttribute("tauarlar", DBManager.getItems());
        request.getRequestDispatcher("/indexpage.jsp").forward(request, response);
    }
}
