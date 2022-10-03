<%@ page import="kz.bitlab.db.News" %>
<%@ page import="kz.bitlab.db.DBManager" %>
<%@ page import="java.util.ArrayList" %>
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
                ArrayList<News> sortedNews = DBManager.getNewsByCategory(request.getParameter("category"));

                if (sortedNews != null) {
                    for (News n : sortedNews) {
            %>
            <div class="row mt-3">
                <div class="col">
                    <div class="card text-bg-light">
                        <div class="card-body">
                            <h5 class="card-title"><% out.print(n.getTitle()); %></h5>
                            <p class="card-text text-muted"><% out.print(n.getContent()); %></p>
                            <a>Author: </a>
                            <a href="#" class="card-link " style="text-decoration: none"><%
                                out.print(n.getAuthor()); %></a>
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
