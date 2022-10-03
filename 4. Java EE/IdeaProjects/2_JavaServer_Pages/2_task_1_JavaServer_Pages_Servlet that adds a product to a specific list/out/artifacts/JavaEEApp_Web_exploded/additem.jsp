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
                <form action="/additem" method="post">
                    <div class="row">
                        <div class="col-12">
                            <label>NAME: </label>
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <input type="text" class="form-control" name="item_name" placeholder="Insert name">
                        </div>
                    </div>
                    <div class="row mt-3">
                        <div class="col-12">
                            <label>PRICE: </label>
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <input type="number" class="form-control" name="item_price" placeholder="Insert price">
                        </div>
                    </div>
                    <div class="row mt-3">
                        <div class="col-12">
                            <label>AMOUNT: </label>
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <input type="number" class="form-control" name="item_amount" placeholder="Insert amount">
                        </div>
                    </div>
                    <div class="row mt-3">
                        <div class="col-12">
                            <button class="btn btn-success">ADD ITEM</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
