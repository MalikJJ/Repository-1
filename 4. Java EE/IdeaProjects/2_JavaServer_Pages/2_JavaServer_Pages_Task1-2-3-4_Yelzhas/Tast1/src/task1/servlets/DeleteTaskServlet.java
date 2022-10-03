package task1.servlets;

import task1.dbmanager.DBManagerTasks;
import task1.dbmanager.Tasks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deleteTask")
public class DeleteTaskServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id= Integer.parseInt(req.getParameter("id"));
        DBManagerTasks.deleteTask(id);
        resp.sendRedirect("task_views/index.jsp");
    }


}
