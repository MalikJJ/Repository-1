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
            <%--            <button type="button" class="btn btn-primary mt-3">+ Добавить задание</button>--%>
                        <a class="btn btn-primary mt-3" href="/addtask">+ Добавить задание</a>
            <button type="button" class="btn btn-primary mt-3" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                + Добавить задание
            </button>
                <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <form action="/addtask" method="post">
                                    <div class="row mt-4 mb-2">
                                        <div class="col">
                                            <label>Наименование:</label>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col">
                                            <input type="text" class="form-control" name="task_name" placeholder="Наименование:">
                                        </div>
                                    </div>
                                    <div class="row mt-3 mb-2">
                                        <div class="col">
                                            <label>Описание:</label>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col">
                                            <textarea class="form-control" name="task_description" placeholder="Описание:"></textarea>
                                        </div>
                                    </div>
                                    <div class="row mt-3 mb-2">
                                        <div class="col">
                                            <label>Крайний срок:</label>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col">
                                            <input type="date" class="form-control" name="task_deadlineDate" placeholder="Крайний срок:">
                                        </div>
                                    </div>
                                    <div class="row mt-3 mb-2">
                                        <div class="col">
                                            <label>Выполнено: </label>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col">
                                            <select class="form-select" name="task_status">
                                                <option>Да</option>
                                                <option selected>Нет</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="row mt-3 mb-2">
                                        <div class="col">
                                            <button class="btn btn-success">Добавить</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary">Understood</button>
                            </div>
                        </div>
                    </div>
                </div>
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
                    <td><% out.print(task.getDescription()); %></td>
                    <td>
                        <a href="/details?id=<% out.print(task.getId()); %>">
                            <button type="button" class="btn btn-primary btn-sm">Детали</button>
                        </a>
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
