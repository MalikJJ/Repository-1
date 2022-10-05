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
                    <form class="form-control mt-3">
                        <div class="row mt-3 ms-3">
                            <div class="col-4">
                                <label>NAME:</label>
                            </div>
                            <div class="col-8">
                                <p class="fw-bold"><%=student.getName()%></p>
                            </div>
                        </div>
                        <div class="row mt-3 ms-3">
                            <div class="col-4">
                                <label>SURNAME:</label>
                            </div>
                            <div class="col-8">
                                <p class="fw-bold"><%=student.getSurname()%></p>
                            </div>
                        </div>
                        <div class="row mt-3 ms-3">
                            <div class="col-4">
                                <label>BIRTHDATE:</label>
                            </div>
                            <div class="col-8">
                                <p class="fw-bold"><%=student.getBirthDate()%></p>
                            </div>
                        </div>
                        <div class="row mt-3 ms-3">
                            <div class="col-4">
                                <label>CITY:</label>
                            </div>
                            <div class="col-8">
                                <p class="fw-bold"><%=student.getCity()%></p>
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
