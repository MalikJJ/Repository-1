<%@ page import="kz.bitlab.db.Users" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Users currentUser = (Users) session.getAttribute("currentUser");
%>
<nav class="navbar navbar-expand-lg py-3"
     style="border-radius: 10px; background: linear-gradient(lightgray, white);">
    <div class="container-fluid">
        <a class="navbar-brand fw-semibold" href="/">BITLAB SHOP</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="/">Top Sales</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/">New Sales</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/">By Category</a>
                </li>
                <%
                    if (currentUser != null) {
                %>
                <li class="nav-item">
                    <a class="nav-link" href="/profile"><%=currentUser.getFulName()%></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/logout">Sign Out</a>
                </li>
                <%
                    } else {
                %>
                <li class="nav-item">
                    <a class="nav-link" href="/login">Sign In</a>
                </li>
                <%
                    }
                %>
            </ul>
        </div>
    </div>
</nav>