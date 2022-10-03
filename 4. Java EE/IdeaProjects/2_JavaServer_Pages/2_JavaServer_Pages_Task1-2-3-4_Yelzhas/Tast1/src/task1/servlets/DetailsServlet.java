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

@WebServlet(value = "/details")
public class DetailsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id1=Integer.parseInt(req.getParameter("id"));
        System.out.println(id1);
        Item item=new Item();
        ArrayList<Item> allItems= DBManager.getAllItems();
        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getId() == id1){
                item=allItems.get(i);
            }
        }
        req.setAttribute("item",item);
        req.getRequestDispatcher("views/details.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
