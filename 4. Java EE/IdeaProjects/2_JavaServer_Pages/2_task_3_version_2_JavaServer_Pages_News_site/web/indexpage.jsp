<%@ page import="kz.bitlab.db.News" %>
<%@ page import="kz.bitlab.db.DBManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="navbar.jsp" %>
    <div class="row">
        <div class="col-12">
            <%
                if (DBManager.getNewsList() != null) {
                    for (News news : DBManager.getNewsList()) {
            %>
            <div class="row mt-3">
                <div class="col">
                    <div class="card text-bg-light">
                        <div class="card-body">
                            <h5 class="card-title"><% out.print(news.getTitle()); %></h5>
                            <p class="card-text text-muted"><% out.print(news.getContent()); %></p>
                            <a>Author: </a>
                            <a href="#" class="card-link text-dark fw-semibold" style="text-decoration: none"><%
                                out.print(news.getAuthor()); %></a>
                        </div>
                    </div>
                </div>
            </div>
            <%
                    }
                }
            %>
        </div>
    </div>
    <%@include file="footer.jsp" %>
</div>
</body>
</html>
