package task1.servlets;

import task1.dbmanager.DBManager;
import task1.dbmanager.DBManagerTasks;
import task1.dbmanager.Tasks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@WebServlet(value = "/addTask")
public class AddTaskServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String date1 = req.getParameter("date");
        System.out.println(date1);
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date = formatter.parse(date1);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Tasks task = new Tasks(null, name, description, date);
        DBManagerTasks.addTasks(task);
        resp.sendRedirect("/task");
    }
}
