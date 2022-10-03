package task1.servlets;


import task1.dbmanager.DBManager;
import task1.dbmanager.DBManegerNews;
import task1.dbmanager.Item;
import task1.dbmanager.News;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/economic")
public class EconomicsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<News> allNews= DBManegerNews.allNews();
        ArrayList<News> economics=new ArrayList<>();
        for (int i = 0; i < allNews.size(); i++) {
            if (allNews.get(i).getCategoryNumber()==2){
                economics.add(allNews.get(i));
            }
        }
        req.setAttribute("economics",economics);
        req.getRequestDispatcher("views/economicNews.jsp").forward(req,resp);
    }

}


