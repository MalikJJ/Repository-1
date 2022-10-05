<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.db.Genre" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <%@include file="head.jsp"%>
    </head>
    <body>
        <div class="container">
            <%@include file="navbar.jsp"%>
        </div>
        <div class="container mt-3" style="min-height: 800px;">
            <div class="row">
                <div class="col-12 mx-auto">
                    <h3 class="text-center">HELLO <%=currentUser!=null?currentUser.getFullName():""%></h3>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
