<%@ page import="kz.bitlab.db.Film" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="navbar.jsp" %>
</div>
<div class="container mt-3">
    <div class="row">
        <div class="col-6 mx-auto">
            <%
                Film film = (Film) request.getAttribute("kino");
                if (film != null) {
            %>
            <form>
                <div class="row">
                    <div class="col-12">
                        <label>NAME: </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <input type="text" class="form-control" name="film_name" placeholder="Name" readonly
                               value="<% out.print(film.getName()); %>">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <label>DESCRIPTION: </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <textarea class="form-control" name="film_description" placeholder="Description" readonly><%
                            out.print(film.getDescription()); %></textarea>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <label>GENRE: </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <input type="text" class="form-control" readonly value="<% out.print(film.getGenre()); %>">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <label>DURATION: </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <input type="text" class="form-control" readonly
                               value="<% out.print(film.getDuration()); %> min">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <label>YEAR: </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <input type="text" class="form-control" readonly value="<% out.print(film.getYear()); %>">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <label>RATING: </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <input type="text" class="form-control" readonly value="<% out.print(film.getRating()); %>">
                    </div>
                </div>
            </form>
            <%
                }
            %>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
