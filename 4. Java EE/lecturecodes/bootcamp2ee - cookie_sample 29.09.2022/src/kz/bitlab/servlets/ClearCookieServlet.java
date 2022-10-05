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

@WebServlet(value = "/clearcookie")
public class ClearCookieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie cookies[] = req.getCookies();
        Optional<Cookie> opt = Arrays.stream(cookies).
                filter(cookie -> cookie.getName().equals("user_name")).
                findFirst();
        if(opt.isPresent()){
            Cookie foundCookie = opt.get();
            foundCookie.setMaxAge(0);
            resp.addCookie(foundCookie);
        }

        resp.sendRedirect("/cookie");
    }
}
