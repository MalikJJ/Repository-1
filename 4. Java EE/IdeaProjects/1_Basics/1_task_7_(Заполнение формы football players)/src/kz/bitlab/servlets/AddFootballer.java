package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Footballer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addfootballer")
public class AddFootballer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("footballer_name");
        String surname = request.getParameter("footballer_surname");
        int salary = Integer.parseInt(request.getParameter("footballer_salary"));
        String club = request.getParameter("footballer_club");
        int transferPrice = Integer.parseInt(request.getParameter("footballer_transferPrice"));

        Footballer footballer = new Footballer();
        footballer.setName(name);
        footballer.setSurname(surname);
        footballer.setSalary(salary);
        footballer.setClub(club);
        footballer.setTransferPrice(transferPrice);

        DBManager.addFootballer(footballer);

//        response.sendRedirect("/");
        response.sendRedirect("/output");

    }
}
