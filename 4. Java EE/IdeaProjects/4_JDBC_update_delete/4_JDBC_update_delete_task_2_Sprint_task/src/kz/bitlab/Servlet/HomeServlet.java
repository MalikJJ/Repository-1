package kz.bitlab.Servlet;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Items;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Items> itemList = DBManager.getItems();
        request.setAttribute("itemList", itemList);
        request.getRequestDispatcher("indexpage.jsp").forward(request, response);
    }
}
