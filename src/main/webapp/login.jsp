<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/15/20
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            response.sendRedirect("profile.jsp");
        }
    }
%>
<html>
<head>
    <%@include file="partials/head.jsp" %>
    <title>Login Page</title>
</head>
<body>
<%@include file="partials/navbar.jsp" %>
<h3>Please Log In</h3>
<form action="login.jsp" class="ml-3" method="POST">
    <div class="form-group w-25">
        <label for="username">Username</label>
        <input type="text" class="form-control" id="username" name="username">
    </div>
    <div class="form-group w-25">
        <label for="password">Password</label>
        <input type="password" class="form-control" id="password" name="password">
    </div>
    <button type="submit" class="btn btn-primary">Login</button>
</form>
</body>
</html>
