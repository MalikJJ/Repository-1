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
    </div>
</div>
</body>
</html>
