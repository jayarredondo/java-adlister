<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/20/20
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="View Car Advertisements"/>
    </jsp:include>
</head>
<body>
<div class="container">
    <h2>Create Car Ad</h2>
    <form action="/create-car" method="post">
        <div class="form-group">
            <label for="make">Make: </label><input type="text" id="make" name="make" class="form-control">
        </div>
        <div class="form-group">
            <label for="model">Model: </label><input type="text" id="model" name="model" class="form-control">
        </div>
        <div class="form-group">
            <label for="year">Year: </label><input type="text" id="year" name="year" class="form-control">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Create Ad">
    </form>
</div>
</body>
</html>
