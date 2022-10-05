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
                <div class="col-6 mx-auto">
                    <%
                        String error = request.getParameter("error");
                        if(error!=null){
                    %>
                        <div class="alert alert-danger alert-dismissible fade show" role="alert">
                            Incorrect email or password!
                            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                        </div>
                    <%
                        }
                    %>
                    <form action="/login" method="post">
                        <div class="row">
                            <div class="col-12">
                                <label>EMAIL : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="text" class="form-control" name="email" placeholder="Email">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>PASSWORD : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="password" class="form-control" name="password" placeholder="Password">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <button class="btn btn-success">SIGN IN</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
