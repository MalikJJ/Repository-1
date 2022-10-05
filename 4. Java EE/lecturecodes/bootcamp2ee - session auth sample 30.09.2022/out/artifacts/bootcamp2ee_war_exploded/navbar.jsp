<%
    User currentUser = (User) session.getAttribute("currentUser");
%>
<nav class="navbar navbar-expand-lg navbar-dark mb-4" style="background-color: rgba(37,126,200,1);">
    <div class="container-fluid">
        <a class="navbar-brand" href="/"><strong>FILMS.NET</strong></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="/">Home</a>
                </li>
                <%
                    if(currentUser!=null){
                %>
                    <li class="nav-item">
                        <a class="nav-link" href="/profile"><%=currentUser.getFullName()%></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/addfilm">Add Film</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/logout">Logout</a>
                    </li>
                <%
                    }else{
                %>
                    <li class="nav-item">
                        <a class="nav-link" href="/login">Login</a>
                    </li>
                <%
                    }
                %>
            </ul>
        </div>
    </div>
</nav>