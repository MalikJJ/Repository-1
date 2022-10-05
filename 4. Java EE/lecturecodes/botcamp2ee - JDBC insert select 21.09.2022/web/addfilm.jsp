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
                    <form action="/addfilm" method="post">
                        <div class="row">
                            <div class="col-12">
                                <label>NAME : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="text" class="form-control" name="film_name" placeholder="Name">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>DESCRIPTION : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <textarea class="form-control" name="film_description" placeholder="Description"></textarea>
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>GENRE : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <select class="form-control" name="film_genre">
                                    <option>action</option>
                                    <option>horror</option>
                                    <option>comedy</option>
                                    <option>drama</option>
                                    <option>tragedy</option>
                                    <option>fantasy</option>
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
                                        <option><% out.print(i);%></option>
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
                                        <option><% out.print(i);%></option>
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
                                <input class="form-control" type="text" value="0" name="film_rating">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <button class="btn btn-success">ADD FILM</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
