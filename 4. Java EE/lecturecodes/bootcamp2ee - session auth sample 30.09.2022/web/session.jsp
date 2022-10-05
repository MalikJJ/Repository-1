<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <%
            String userName = (String) session.getAttribute("userName");
        %>
        <h1>
            <%=userName%>
        </h1>
        <form action="/session" method="post">
            NAME : <input type="text" name="user_name">
            <button>SEND</button>
        </form>
    </body>
</html>
