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
    <div class="row mt-5 mb-5">
        <div class="col-9 mx-auto">
            <h3 class="text-center">Hello <%=currentUser != null ? currentUser.getFulName() + "!" : ""%>
            </h3>
            <p class="text-center text-muted mt-3">This is your profile page</p>
        </div>
    </div>
</div>
</body>
</html>
