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

                <form action="/home" method="post">
                    <div class="form-group row">
                        <label class="col-sm-4 col-form-label">Name of Item:</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" placeholder="Name of Item" name="name">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-4 col-form-label">Price:</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" placeholder="Price" name="price">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-4 col-form-label">Amount:</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" placeholder="Amount of ...." name="amount">
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

