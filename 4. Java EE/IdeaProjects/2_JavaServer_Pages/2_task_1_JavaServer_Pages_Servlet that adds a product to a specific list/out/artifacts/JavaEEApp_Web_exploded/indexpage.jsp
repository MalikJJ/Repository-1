<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.db.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <%@include file="head.jsp"%>
    </head>
    <body>
        <div class="container">
            <%@include file="navbar.jsp"%>
        </div>
        <div class="container mt-3">
            <div class="row">
                <div class="col">
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
                            ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("tauarlar");
                            if (items != null) {
                                for (Item item : items) {
                        %>
                        <tbody>
                        <tr>
                            <th scope="row"><% out.print(item.getId()); %></th>
                            <td><% out.print(item.getName()); %></td>
                            <td><% out.print(item.getPrice()); %></td>
                            <td><% out.print(item.getAmount()); %></td>
                            <td>
                                <a href="/details?id=<% out.print(item.getId()); %>"
                                   class="btn btn-light btn-sm">Details</a>
                            </td>
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
