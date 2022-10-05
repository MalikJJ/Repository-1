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
        <div class="col-6 mx-auto">
            <%
                String error = request.getParameter("error");
                if (error != null) {
            %>
            <div class="alert alert-danger alert-dismissible fade show" role="alert">
                Incorrect <strong>email</strong> or <strong>password</strong>!
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
            <%
                }
            %>
            <div class="card shadow-lg mb-5 bg-body rounded">
                <div class="card-header text-bg-light py-3 px-4 fs-5">Login Page</div>
                <div class="card-body">
                    <form action="/login" method="post">
                        <div class="row mt-3">
                            <div class="col-2 my-auto ps-4">
                                <label>Email:</label>
                            </div>
                            <div class="col-10 pe-4">
                                <input type="text" class="form-control" name="email" placeholder="Email" required>
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-2 my-auto ps-4">
                                <label>Password:</label>
                            </div>
                            <div class="col-10 pe-4">
                                <input type="password" class="form-control" name="password" placeholder="Password" required>
                            </div>
                        </div>
                        <div class="row mt-4">
                            <div class="col ps-4">
                                <button class="btn btn-success">Login</button>
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
