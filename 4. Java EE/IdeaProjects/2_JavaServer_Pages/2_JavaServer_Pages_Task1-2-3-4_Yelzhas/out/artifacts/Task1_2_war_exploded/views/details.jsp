<%@ page import="task1.dbmanager.Item" %>
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
                    Item item = (Item) request.getAttribute("item");
                %>
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="/" style="text-decoration: none;">Home</a></li>
                        <li class="breadcrumb-item"><a href="/" style="text-decoration: none;">Items</a></li>
                        <li class="breadcrumb-item active" aria-current="page"><%=item.getName()%></li>
                        <li class="breadcrumb-item active" aria-current="page"><%=item.getAmount()%></li>
                        <li class="breadcrumb-item active" aria-current="page"><%=item.getPrice()%></li>
                    </ol>
                </nav>

            </div>
        </div>
    </div>
</section>


<%@include file="/templates/footer.jsp"%>
</body>
</html>
