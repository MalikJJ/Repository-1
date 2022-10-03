<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.db.Item" %>
<%@ page import="kz.bitlab.db.DBManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="navbar.jsp" %>
    <div class="row mt-3">
        <div class="col-12">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">NAME</th>
                    <th scope="col">PRICE</th>
                    <th scope="col">AMOUNT</th>
                    <th scope="col">DETAILS</th>
                </tr>
                </thead>
                <tbody class="table-group-divider">
                <tr></tr>
                </tbody>
                <%
                    ArrayList<Item> items = DBManager.getItems();
                    if (items != null) {
                        for (Item item : items) {
                %>
                <tbody>
                <tr>
                    <td><% out.print(item.getId()); %></td>
                    <td><% out.print(item.getName()); %></td>
                    <td><% out.print(item.getPrice()); %></td>
                    <td><% out.print(item.getAmount()); %></td>
                    <td><a class="btn btn-sm btn-secondary" href="/details?id=<% out.print(item.getId()); %>">Details</a></td>
                </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
