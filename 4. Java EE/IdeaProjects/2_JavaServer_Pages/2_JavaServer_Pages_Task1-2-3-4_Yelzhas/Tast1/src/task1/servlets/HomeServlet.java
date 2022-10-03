package task1.servlets;

import task1.dbmanager.DBManager;
import task1.dbmanager.Item;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Item> allItems=DBManager.getAllItems();
        req.setAttribute("allItems",allItems);
        System.out.println("What s up bro");
        req.getRequestDispatcher("views/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String price=req.getParameter("price");
        String amount=req.getParameter("amount");

        Double price1=Double.valueOf(price);
        int amount1=Integer.valueOf(amount);

        Item item=new Item(null,name,price1,amount1);
        DBManager.addItems(item);
        resp.sendRedirect("/home");
    }
}
