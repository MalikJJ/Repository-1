<%@ page import="kz.bitlab.db.DBManager" %>
<%@ page import="kz.bitlab.db.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ru">
<head>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="navbar.jsp" %>
    <div class="row">
        <div class="col">
            <a class="btn btn-primary mt-3" href="/addtask">+ Добавить задание</a>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Наименование</th>
                    <th scope="col">Крайний срок</th>
                    <th scope="col">Выполнено</th>
                    <th scope="col">Детали</th>
                </tr>
                </thead>
                <tbody class="table-group-divider">
                <tr></tr>
                </tbody>
                <%
                    if (DBManager.getTaskList() != null) {
                        for (Tasks task : DBManager.getTaskList()) {
                %>
                <tbody>
                <tr>
                    <th scope="row"><% out.print(task.getId()); %></th>
                    <td><% out.print(task.getName()); %></td>
                    <td><% out.print(task.getDeadlineDate()); %></td>
                    <td><% out.print(task.getStatus()); %></td>
                    <td>
                        <a href="/details?id=<% out.print(task.getId()); %>">
                            <button type="button" class="btn btn-primary btn-sm">Детали</button>
                        </a>
<%--                    </td>--%>
<%--                    <td class="d-flex justify-content-start">--%>
<%--                        <a href="/details?id=<% out.print(task.getId()); %>">--%>
<%--                            <button type="button" class="btn btn-warning btn-sm">Изменить</button>--%>
<%--                        </a>--%>
<%--                    </td>--%>
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
