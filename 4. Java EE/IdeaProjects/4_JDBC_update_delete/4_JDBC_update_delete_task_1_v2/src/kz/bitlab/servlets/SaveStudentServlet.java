package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/savestudent")
public class SaveStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        String name = request.getParameter("student_name");
        String surname = request.getParameter("student_surname");
        String birthdate = request.getParameter("student_birthdate");
        String city = request.getParameter("student_city");

        Students student = DBManager.getStudent(id);

        if (student != null) {

            student.setName(name);
            student.setSurname(surname);
            student.setBirthDate(birthdate);
            student.setCity(city);

            DBManager.updateStudent(student);

            response.sendRedirect("/details?id="+id);

        } else {

            response.sendRedirect("/");

        }
    }
}
