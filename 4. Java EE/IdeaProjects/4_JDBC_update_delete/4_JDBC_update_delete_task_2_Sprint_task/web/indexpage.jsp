<%@ page import="java.util.ArrayList" %>
<%@ page import="java.text.StringCharacterIterator" %>
<%@ page import="kz.bitlab.db.Items" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="row mt-3"></div>
<div class="container shadow-lg p-3 mb-5 bg-body rounded">
    <div class="row">
        <div class="col">
            <%@include file="navbar.jsp" %>
        </div>
    </div>
    <div class="row mt-4">
        <div class="col">
            <h2 class="text-center fw-semibold">Welcome to BITLAB SHOP</h2>
        </div>
    </div>
    <div class="row mt-1">
        <div class="col">
            <p class="text-center text-muted">Electronic devices with high quality and service</p>
        </div>
    </div>
    <div class="row">
        <div class="col-9 mb-5 mx-auto">
            <div class="row">
                <%
                    ArrayList<Items> itemList = (ArrayList<Items>) request.getAttribute("itemList");
                    if (itemList != null) {
                        for (Items item : itemList) {
                %>
                <div class="col-4 mt-4">
                    <div class="card text-center shadow bg-body rounded">
                        <div class="card-header bg-light fs-5"><%=item.getName() + " " + item.getModel()%>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title text-success fs-4 mb-4"><%="$" + item.getPrice()%>
                            </h5>
                            <%
                                String[] descriptionSplitted = item.getDescription().split(",");
                                for (int i = 0; i < descriptionSplitted.length; i++) {
                            %>
                            <p class="card-text mb-0"><%=descriptionSplitted[i]%>
                            </p>
                            <%
                                }
                            %>
                            <a href="#" class="btn btn-success btn-sm w-100 mt-4">Buy Now</a>
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
</body>
</html>
