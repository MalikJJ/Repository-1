<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <%@include file="head.jsp"%>
    </head>
    <body>
        <div class="container">
            <%@include file="navbar.jsp"%>
            <div class="row mt-3">
                <div class="col-6 mx-auto">
                    <form class="form-control mt-3 px-5 pb-4" action="/addstudent" method="post">
                        <div class="row mt-3">
                            <div class="col-3">
                                <label>NAME:</label>
                            </div>
                            <div class="col-9">
                                <input type="text" class="form-control" name="student_name" placeholder="Insert name">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-3">
                                <label>SURNAME:</label>
                            </div>
                            <div class="col-9">
                                <input type="text" class="form-control" name="student_surname"
                                       placeholder="Insert surname">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-3">
                                <label>BIRTHDATE:</label>
                            </div>
                            <div class="col-9">
                                <input type="date" class="form-control" name="student_birthdate"
                                       placeholder="Insert birthdate">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-3">
                                <label>CITY:</label>
                            </div>
                            <div class="col-9">
                                <select class="form-select" name="student_city">
                                    <option>Almaty</option>
                                    <option>Astana</option>
                                    <option>Atyrau</option>
                                    <option>Barcelona</option>
                                    <option>Ekibastuz</option>
                                    <option>Kokshetau</option>
                                    <option>Shymkent</option>
                                    <option>Semey</option>
                                    <option>Taraz</option>
                                    <option>Turkestan</option>
                                </select>
                            </div>
                        </div>
                        <div class="row mt-4">
                            <div class="col">
                                <div class="d-flex">
<%--                                    <a href="/" class="btn btn-secondary ms-auto me-3">back</a>--%>
                                    <button class="btn btn-success ms-auto">Add student</button>
                                </div>
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col">
                                <div class="d-flex">
                                    <a href="/" class="btn btn-secondary ms-auto">Back</a>
<%--                                    <button class="btn btn-success">Add student</button>--%>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
