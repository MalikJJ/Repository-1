<%@ page import="kz.bitlab.db.DBManager" %>
<%@ page import="kz.bitlab.db.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="navbar.jsp" %>
    <div class="row">
        <div class="col-6 mx-auto">
            <%
                Tasks task = DBManager.getTask(Integer.parseInt(request.getParameter("id")));
            %>
            <form>
                <div class="row mt-4 mb-2">
                    <div class="col">
                        <label>Наименование:</label>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <input type="text" class="form-control" value="<% out.print(task.getName()); %>">
                    </div>
                </div>
                <div class="row mt-3 mb-2">
                    <div class="col">
                        <label>Описание:</label>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <textarea class="form-control"><% out.print(task.getDescription()); %></textarea>
                    </div>
                </div>
                <div class="row mt-3 mb-2">
                    <div class="col">
                        <label>Крайний срок: </label>
                        <label class="text-muted"><% out.print(task.getDeadlineDate()); %></label>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <input type="date" class="form-control" placeholder="<% out.print(task.getDeadlineDate()); %>"
                               value="<% out.print(task.getDeadlineDate()); %>">
                    </div>
                </div>
                <div class="row mt-3 mb-2">
                    <div class="col">
                        <label>Выполнено: </label>
                        <label class="text-muted"><% out.print(task.getStatus()); %></label>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <select class="form-select">
                            <option>Да</option>
                            <option>Нет</option>
                        </select>
                    </div>
                </div>
                <div class="d-flex justify-content-md-between">
                    <div>
                        <a href="#" class="btn btn-success mt-4">Сохранить</a>
                        <a href="/" class="btn btn-secondary mt-4 ms-3">Отмена</a>
                    </div>
                    <div class="justify-content-end">
                        <div>
                            <a href="#" class="btn btn-danger mt-4 ms-3">Удалить</a>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
