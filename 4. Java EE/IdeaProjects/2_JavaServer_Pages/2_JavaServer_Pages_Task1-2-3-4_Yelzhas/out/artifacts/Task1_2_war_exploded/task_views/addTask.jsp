<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <%@include file="../templates/head.jsp"%>
</head>
<body>
<%@include file="../templates/navbar.jsp"%>
<section class="mt-5">
    <div class="container pt-5">
        <div class="row">
            <div class="col-6 offset-3">

                <form action="/addTask" method="post">
                    <div class="form-group row">
                        <label class="col-sm-4 col-form-label">Name of Task:</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" placeholder="Name of Task" name="name">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-4 col-form-label">Description:</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" placeholder="Description" name="description">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-4 col-form-label">Time:</label>
                        <div class="col-sm-8">
                            <input type="date" class="form-control"  name="date">
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-12">
                            <button type="submit" class="btn btn-primary">Add Item</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>


<%@include file="../templates/footer.jsp"%>
</body>
</html>

