<%@ page import="kz.bitlab.db.Item" %>
<%@ page import="kz.bitlab.db.DBManager" %><%--
  Created by IntelliJ IDEA.
  User: D
  Date: 27.09.2022
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp"%>
</head>
<body>
<div class="container">
    <%@include file="navbar.jsp"%>
    <div class="row">
        <div class="col-6 mx-auto">
            <%
                Item item = DBManager.getItem(Integer.parseInt(request.getParameter("id")));
                if (item != null) {
            %>
            <form>
                <div class="row mt-3">
                    <div class="col">
                        <label>NAME:</label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col">
                        <a style="font-weight: bold"><%
                            out.print(item.getName());
                        %></a>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col">
                        <label>PRICE:</label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col">
                        <a style="font-weight: bold"><%
                            out.print(item.getPrice());
                        %></a>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col">
                        <label>AMOUNT:</label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col">
                        <a style="font-weight: bold"><%
                            out.print(item.getAmount());
                        %></a>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col">
                        <a class="btn btn-sm btn-secondary" href="/">Back</a>
                    </div>
                </div>
            </form>
            <%
                }
            %>
        </div>
    </div>
</div>

</body>
</html>
