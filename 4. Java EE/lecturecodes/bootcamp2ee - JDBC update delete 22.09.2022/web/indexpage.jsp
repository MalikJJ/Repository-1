<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.db.Film" %>
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
                <div class="col-10 mx-auto">
                    <div class="row">
                        <%
                            ArrayList<Film> films = (ArrayList<Film>) request.getAttribute("kinolar");
                            if(films != null){
                                for(Film f : films){
                        %>
                            <div class="col-3">
                                <div class="card mb-3">
                                    <div class="card-body">
                                        <h5 class="card-title"><% out.print(f.getName()); %></h5>
                                        <p class="card-text">
                                            <% out.print(f.getDescription()); %>
                                            <h6>Genre : <% out.print(f.getGenre()); %></h6>
                                            <h6>Duration : <% out.print(f.getDuration()); %> min</h6>
                                            <h6>Rating : <% out.print(f.getRating()); %></h6>
                                        </p>
                                        <a href="/details?id=<% out.print(f.getId());%>" class="btn btn-primary btn-sm">Details</a>
                                    </div>
                                </div>
                            </div>
                        <%
                                }
                            }
                        %>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
