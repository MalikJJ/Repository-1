package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/additem")
public class AddItemServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/additem.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("item_name");
        double price = Double.parseDouble(request.getParameter("item_price"));
        int amount = Integer.parseInt(request.getParameter("item_amount"));

        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        item.setAmount(amount);

        DBManager.addItem(item);

        response.sendRedirect("/");

    }
}
