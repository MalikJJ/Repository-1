package task1.servlets;

import task1.dbmanager.DBManegerNews;
import task1.dbmanager.News;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/culture")
public class CultureServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<News> allNews= DBManegerNews.allNews();
        ArrayList<News> culture=new ArrayList<>();
        for (int i = 0; i < allNews.size(); i++) {
            if (allNews.get(i).getCategoryNumber()==3){
                culture.add(allNews.get(i));
            }
        }
        req.setAttribute("culture",culture);
        req.getRequestDispatcher("views/cultureNews.jsp").forward(req,resp);
    }
}
