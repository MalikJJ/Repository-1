<%@ page import="task1.dbmanager.Item" %>
<%@ page import="task1.dbmanager.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <%@include file="/templates/head.jsp"%>
</head>
<body>
<%@include file="/templates/navbar.jsp"%>
<section class="mt-5">
    <div class="container pt-5">
        <div class="row">

            <div class="col-9">
                <%
                    Tasks task = (Tasks) request.getAttribute("task");
                %>
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="/" style="text-decoration: none;">Home</a></li>
                        <li class="breadcrumb-item"><a href="/" style="text-decoration: none;">Items</a></li>
                        <li class="breadcrumb-item active" aria-current="page"><%=task.getName()%></li>
                        <li class="breadcrumb-item active" aria-current="page"><%=task.getDescription()%></li>
                        <li class="breadcrumb-item active" aria-current="page"><%=task.getDeadlineDate()%></li>
                        <a href="/deleteTask?id=<%=task.getId()%>" class="btn btn-primary">Delete</a>
                    </ol>
                </nav>

            </div>
        </div>
    </div>
</section>


<%@include file="/templates/footer.jsp"%>
</body>
</html>
