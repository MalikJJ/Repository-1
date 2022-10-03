package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Tasks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static kz.bitlab.db.DBManager.getTask;

@WebServlet(value = "/edittask")
public class EditTaskServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.setCharacterEncoding("UTF8");

//        request.getRequestDispatcher("/details.jsp").forward(request, response);
//
//        String name = request.getParameter("task_name");
//        String description = request.getParameter("task_description");
//        String deadlineDate = request.getParameter("task_deadlineDate");
//        String status = request.getParameter("task_status");
//
//        Tasks task = DBManager.getTask(Integer.parseInt(request.getParameter("id")));
//
//        System.out.println(request.getParameter("id"));
//
//        task.setName(name);
//        task.setDescription(description);
//        task.setDeadlineDate(deadlineDate);
//        task.setStatus(status);
//

        String name = DBManager.getTask(Integer.parseInt(request.getParameter("id"))).getName();
        System.out.println(name);

//        DBManager.getTask(Integer.parseInt(request.getParameter("id"))).setName(name);

        String description = DBManager.getTask(Integer.parseInt(request.getParameter("id"))).getDescription();
        System.out.println(description);

        DBManager.getTask(Integer.parseInt(request.getParameter("id"))).setName("Тест");

        response.sendRedirect("/");

//        request.getRequestDispatcher("/edittask.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF8");
//
        String name = request.getParameter("task_name");

//        System.out.println(name);

//        String description = request.getParameter("task_description");
//        String deadlineDate = request.getParameter("task_deadlineDate");
//        String status = request.getParameter("task_status");
//
//        Tasks editedTask = DBManager.getTask(Integer.parseInt(request.getParameter("id")));
//
//        editedTask.setName(name);
//        editedTask.setDescription(description);
//        editedTask.setDeadlineDate(deadlineDate);
//        editedTask.setStatus(status);

//        DBManager.getTask(Integer.parseInt(request.getParameter("id"))).setName("test");

        response.sendRedirect("/");
    }
}
