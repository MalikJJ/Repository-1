<%@ page import="kz.bitlab.db.Students" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="navbar.jsp" %>
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
                        <p class="fw-bold"><%=student.getName()%>
                        </p>
                    </div>
                </div>
                <div class="row mt-3 ms-3">
                    <div class="col-4">
                        <label>SURNAME:</label>
                    </div>
                    <div class="col-8">
                        <p class="fw-bold"><%=student.getSurname()%>
                        </p>
                    </div>
                </div>
                <div class="row mt-3 ms-3">
                    <div class="col-4">
                        <label>BIRTHDATE:</label>
                    </div>
                    <div class="col-8">
                        <p class="fw-bold"><%=student.getBirthDate()%>
                        </p>
                    </div>
                </div>
                <div class="row mt-3 ms-3">
                    <div class="col-4">
                        <label>CITY:</label>
                    </div>
                    <div class="col-8">
                        <p class="fw-bold"><%=student.getCity()%>
                        </p>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <button type="button" class="btn btn-primary m-4" data-bs-toggle="modal"
                                data-bs-target="#editStudentModal">
                            EDIT STUDENT
                        </button>
                    </div>
                </div>
                <div class="modal fade" id="editStudentModal" data-bs-backdrop="static" data-bs-keyboard="false"
                     tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <form action="/savestudent" method="post">
                            <input type="hidden" name="id" value="<%=student.getId()%>">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h1 class="modal-title fs-5" id="staticBackdropLabel">Edit student</h1>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                                            aria-label="Close"></button>
                                </div>
                                <div class="modal-body">
                                    <div class="row mt-3 ms-3">
                                        <div class="col-4">
                                            <label>NAME:</label>
                                        </div>
                                        <div class="col-8">
                                            <input type="text" class="form-control" name="student_name"
                                                   placeholder="Name" value="<%=student.getName()%>">
                                        </div>
                                    </div>
                                    <div class="row mt-3 ms-3">
                                        <div class="col-4">
                                            <label>SURNAME:</label>
                                        </div>
                                        <div class="col-8">
                                            <input type="text" class="form-control" name="student_surname"
                                                   placeholder="Surname" value="<%=student.getSurname()%>">
                                        </div>
                                    </div>
                                    <div class="row mt-3 ms-3">
                                        <div class="col-4">
                                            <label>BIRTHDATE:</label>
                                        </div>
                                        <div class="col-8">
                                            <input type="date" class="form-control" name="student_birthdate"
                                                   placeholder="Birthdate" value="<%=student.getBirthDate()%>">
                                            </p>
                                        </div>
                                    </div>
                                    <div class="row mt-3 ms-3">
                                        <div class="col-4">
                                            <label>CITY:</label>
                                        </div>
                                        <div class="col-8">
                                            <select class="form-select" name="student_city">
                                                <option <%
                                                    if (student.getCity().equals("Almaty")) out.print("selected"); %>
                                                >Almaty
                                                </option>
                                                <option <%
                                                    if (student.getCity().equals("Astana")) out.print("selected"); %>
                                                >Astana
                                                </option>
                                                <option <%
                                                    if (student.getCity().equals("Atyrau")) out.print("selected"); %>
                                                >Atyrau
                                                </option>
                                                <option <%
                                                    if (student.getCity().equals("Barcelona")) out.print("selected"); %>
                                                >Barcelona
                                                </option>
                                                <option <%
                                                    if (student.getCity().equals("Ekibastuz")) out.print("selected"); %>
                                                >Ekibastuz
                                                </option>
                                                <option <%
                                                    if (student.getCity().equals("Kokshetau")) out.print("selected"); %>
                                                >Kokshetau
                                                </option>
                                                <option <%
                                                    if (student.getCity().equals("Semey")) out.print("selected"); %>
                                                >Semey
                                                </option>
                                                <option <%
                                                    if (student.getCity().equals("Shieli")) out.print("selected"); %>
                                                >Shieli
                                                </option>
                                                <option <%
                                                    if (student.getCity().equals("Shymkent")) out.print("selected"); %>
                                                >Shymkent
                                                </option>
                                                <option <%
                                                    if (student.getCity().equals("Taraz")) out.print("selected"); %>
                                                >Taraz
                                                </option>
                                                <option <%
                                                    if (student.getCity().equals("Turkestan")) out.print("selected"); %>
                                                >Turkestan
                                                </option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel
                                    </button>
                                    <button class="btn btn-primary ms-3">SAVE STUDENT</button>
                                    <button type="button" class="btn btn-danger ms-3" data-bs-toggle="modal"
                                            data-bs-target="#deleteStudentModal">
                                        DELETE STUDENT
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="modal fade" id="deleteStudentModal" data-bs-backdrop="static"
                     data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <form action="/deletestudent" method="post">
                            <input type="hidden" name="id" value="<%=student.getId()%>">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h1 class="modal-title fs-5">Confirm delete</h1>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                                            aria-label="Close"></button>
                                </div>
                                <div class="modal-body">
                                    <h5>Are you sure?</h5>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary"
                                            data-bs-dismiss="modal">NO
                                    </button>
                                    <button class="btn btn-danger">YES</button>
                                </div>
                            </div>
                        </form>
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
