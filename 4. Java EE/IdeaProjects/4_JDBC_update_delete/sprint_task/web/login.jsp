<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="row mt-3"></div>
<div class="container shadow-lg p-3 mb-5 bg-body rounded">
    <div class="row">
        <div class="col">
            <%@include file="navbar.jsp" %>
        </div>
    </div>
    <div class="row mt-4">
        <div class="col-9 mx-auto">
            <%
                String error = request.getParameter("error");
                if (error != null) {
            %>
            <div class="alert alert-danger alert-dismissible fade show" role="alert">
                Incorrect email or password!
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
            <%
                }
            %>
            <div class="card mb-3">
                <div class="card-header text-bg-light">Login page</div>
                <div class="card-body">
                    <form action="login" method="post">
                        <div class="row">
                            <div class="col-3">
                                <label>EMAIL:</label>
                            </div>
                            <div class="col-9">
                                <input type="text" class="form-control" name="email" placeholder="Email">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-3">
                                <label>PASSWORD:</label>
                            </div>
                            <div class="col-9">
                                <input type="password" class="form-control" name="password" placeholder="Password">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col">
                                <button class="btn btn-sm btn-success">Login</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
