<%@ page import="task1.dbmanager.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="task1.dbmanager.News" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Items</title>
    <%@include file="../templates/head.jsp" %>
</head>
<body>
<%@include file="../templates/navbarForTengrinews.jsp" %>

<section class="mt-5">
    <div class="container pt-5">
        <div class="row">
            <div class="col-3">
            </div>
            <div class="col-9">
                <div class="row">

                    <%
                        ArrayList<News> news = (ArrayList<News>) request.getAttribute("news");
                        if (news != null) {
                            for (News n : news) {

                    %>

                    <div class="card ml-4 mb-4" style="width: 18rem;">
                        <div class="card-body">
                            <h5 class="card-title"><%=n.getTitle()%>
                            </h5>
                            <p class="card-text">
                                Author: <b><%=n.getAuthor()%> KZT</b> <br>
                                Content: <%=n.getContent()%> <br>
                            </p>
                        </div>
                    </div>

                    <%
                            }
                        }

                    %>

                </div>
            </div>
        </div>
    </div>
</section>


<%@ include file="../templates/footer.jsp" %>
</body>
</html>
