<%@ page import="kz.bitlab.db.Students" %>
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
                    <%
                        Students student = (Students) request.getAttribute("student");
                        if (student != null) {
                    %>
                    <form class="form-control">
                        <div class="row mt-3">
                            <div class="col">
                                <label>NAME</label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col">
                                <input type="text" class="form-control" value="<%=student.getName()%>" readonly>
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col">
                                <label>SURNAME</label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col">
                                <input type="text" class="form-control" value="<%=student.getSurname()%>" readonly>
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col">
                                <label>BIRTHDATE</label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col">
                                <input type="text" class="form-control" value="<%=student.getBirthDate()%>" readonly>
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col">
                                <label>CITY</label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col">
                                <input type="text" class="form-control" value="<%=student.getCity()%>" readonly>
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col">
                                <div class="d-flex">
                                    <a href="/" class="btn btn-secondary ms-auto mb-3">Back</a>
                                </div>
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
