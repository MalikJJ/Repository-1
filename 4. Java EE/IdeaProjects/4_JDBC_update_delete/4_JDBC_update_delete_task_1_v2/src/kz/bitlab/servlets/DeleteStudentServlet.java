package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deletestudent")
public class DeleteStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Students student = DBManager.getStudent(id);

        if (student != null) {

            DBManager.deleteStudent(id);
        }
        response.sendRedirect("/");
    }
}
