<%@ page import="java.util.ArrayList" %>
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
                <div class="col">
                    <table class="table table-hover table-striped">
                        <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">NAME</th>
                            <th scope="col">SURNAME</th>
                            <th scope="col">BIRTHDATE</th>
                            <th scope="col">CITY</th>
                            <th scope="col">DETAILS</th>
                        </tr>
                        </thead>
                        <tbody class="table-group-divider">
                        <tr></tr>
                        </tbody>
                        <tbody>
                    <%
                        ArrayList<Students>
                                listOfStudents = (ArrayList<Students>) request.getAttribute("listOfStudents");
                        if (listOfStudents != null) {
                            for (Students student : listOfStudents) {
                    %>
                        <tr>
                            <th scope="row"><%=student.getId()%></th>
                            <td><%=student.getName()%></td>
                            <td><%=student.getSurname()%></td>
                            <td><%=student.getBirthDate()%></td>
                            <td><%=student.getCity()%></td>
                            <td><a class="btn btn-secondary btn-sm"
                                   href="/details?id=<%=student.getId()%>">Details</a></td>
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
