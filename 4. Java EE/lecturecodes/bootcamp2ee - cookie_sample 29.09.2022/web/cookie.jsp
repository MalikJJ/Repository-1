<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Optional" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form action="/cookie" method="post">
            COOKIE VALUE : <input type="text" name="cookie_name">
            <button>SEND</button>
        </form>
        <form action="/clearcookie" method="post">
            <button>CLEAR ALL</button>
        </form>
        <%
            Cookie [] cookies = request.getCookies();
            Optional<Cookie> opt = Arrays.stream(cookies)
                    .filter(cookie -> cookie
                            .getName()
                            .equals("user_name")
                    ).findFirst();
            out.print(opt.isPresent()?opt.get().getValue():"NO VALUE SPECIFIED");
        %>
    </body>
</html>
