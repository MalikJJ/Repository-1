<%@ page import="kz.bitlab.db.Film" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.db.Genre" %>
<%@ page import="kz.bitlab.db.DBManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <%@include file="head.jsp"%>
    </head>
    <body>
        <div class="container">
            <%@include file="navbar.jsp"%>
        </div>
        <div class="container mt-3">
            <div class="row">
                <div class="col-6 mx-auto">
                    <%
                        Film film = (Film) request.getAttribute("kino");
                        if(film!=null){
                    %>
                        <div class="row">
                            <div class="col-12">
                                <label>NAME : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="text" class="form-control" placeholder="Name" readonly value="<% out.print(film.getName()); %>">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>DESCRIPTION : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <textarea class="form-control" placeholder="Description" readonly><% out.print(film.getDescription()); %></textarea>
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>GENRE : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="text" class="form-control" readonly value="<% out.print(film.getGenre().getName()); %>">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>DURATION : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="text" class="form-control" readonly value="<% out.print(film.getDuration()); %> min">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>YEAR : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="text" class="form-control" readonly value="<% out.print(film.getYear()); %>">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>RATING : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="text" class="form-control" readonly value="<% out.print(film.getRating()); %>">
                            </div>
                        </div>
                        <%
                            if(currentUser!=null){
                        %>
                        <div class="row mt-3">
                            <div class="col-12">
                                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#editFilmModal">
                                    EDIT FILM
                                </button>
                                <button type="button" class="btn btn-danger ms-2" data-bs-toggle="modal" data-bs-target="#deleteFilmModal">
                                    DELETE FILM
                                </button>
                            </div>
                        </div>
                        <%
                            }
                        %>
                        <%
                            if(currentUser!=null){
                        %>
                        <div class="modal fade" id="editFilmModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <form action="/savefilm" method="post">
                                    <input type="hidden" name="id" value="<%=film.getId()%>">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="staticBackdropLabel">Edit Film</h5>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">
                                            <div class="row">
                                                <div class="col-12">
                                                    <label>NAME : </label>
                                                </div>
                                            </div>
                                            <div class="row mt-2">
                                                <div class="col-12">
                                                    <input type="text" class="form-control" name="film_name" placeholder="Name" value="<% out.print(film.getName()); %>">
                                                </div>
                                            </div>
                                            <div class="row mt-3">
                                                <div class="col-12">
                                                    <label>DESCRIPTION : </label>
                                                </div>
                                            </div>
                                            <div class="row mt-2">
                                                <div class="col-12">
                                                    <textarea class="form-control" name="film_description" placeholder="Description"><% out.print(film.getDescription()); %></textarea>
                                                </div>
                                            </div>
                                            <div class="row mt-3">
                                                <div class="col-12">
                                                    <label>GENRE : </label>
                                                </div>
                                            </div>
                                            <div class="row mt-2">
                                                <div class="col-12">
                                                    <select class="form-select" name="film_genre">
                                                        <%
                                                            ArrayList<Genre> genres = DBManager.getGenres();
                                                            if(genres!=null){
                                                                for(Genre g : genres){
                                                        %>
                                                            <option value="<%=g.getId()%>" <% if(g.getId()==film.getGenre().getId()) {out.print("selected");} %> >
                                                                <%=g.getName() + " / " + g.getCode()%>
                                                            </option>
                                                        <%
                                                                }
                                                            }
                                                        %>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="row mt-3">
                                                <div class="col-12">
                                                    <label>DURATION : </label>
                                                </div>
                                            </div>
                                            <div class="row mt-2">
                                                <div class="col-12">
                                                    <select class="form-select" name="film_duration">
                                                        <%
                                                            for(int i=0;i<400;i+=10){
                                                        %>
                                                        <option <% if(i==film.getDuration()) out.print("selected");%>><% out.print(i);%></option>
                                                        <%
                                                            }
                                                        %>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="row mt-3">
                                                <div class="col-12">
                                                    <label>YEAR : </label>
                                                </div>
                                            </div>
                                            <div class="row mt-2">
                                                <div class="col-12">
                                                    <select class="form-select" name="film_year">
                                                        <%
                                                            for(int i=1920;i<2022;i++){
                                                        %>
                                                        <option <% if(i==film.getYear()) out.print("selected");%> ><% out.print(i);%></option>
                                                        <%
                                                            }
                                                        %>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="row mt-3">
                                                <div class="col-12">
                                                    <label>RATING : </label>
                                                </div>
                                            </div>
                                            <div class="row mt-2">
                                                <div class="col-12">
                                                    <input type="text" class="form-control" name="film_rating" value="<% out.print(film.getRating()); %>">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CLOSE</button>
                                            <button class="btn btn-primary">SAVE</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="modal fade" id="deleteFilmModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-hidden="true">
                            <div class="modal-dialog">
                                <form action="/deletefilm" method="post">
                                    <input type="hidden" name="id" value="<%=film.getId()%>">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title">Delete Film</h5>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">
                                            <h3 class="text-center">Are you sure to delete film?</h3>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CLOSE</button>
                                            <button class="btn btn-danger">DELETE</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    <%
                        }
                    %>
                    <%
                        }
                    %>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
