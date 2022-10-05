package kz.bitlab.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

@WebServlet(value = "/cookie")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie [] cookies = request.getCookies();
        Optional<Cookie> opt = Arrays.stream(cookies)
                .filter(cookie -> cookie
                        .getName()
                        .equals("user_name")
                ).findFirst();
        System.out.print(opt.isPresent()?opt.get().getValue():"NO VALUE SPECIFIED");

        request.getRequestDispatcher("/cookie.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cookieName = request.getParameter("cookie_name");

        Cookie cookie = new Cookie("user_name", cookieName);
        cookie.setMaxAge(3600*24);
        response.addCookie(cookie);

        response.sendRedirect("/cookie");

    }
}