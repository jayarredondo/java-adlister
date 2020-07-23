<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/22/20
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register Account"/>
    </jsp:include>
</head>
<body>
<div class="container">
    <h1>Create An Account</h1>
    <form action="/register" method="POST">
        <div class="form-group">
            <label for="email">Email</label>
            <input id="email" name="email" class="form-control" type="text" placeholder="example@email.com">
        </div>
        <div class="form-group">
            <label for="username">Username</label>
            <input id="username" name="username" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input id="password" name="password" class="form-control" type="password">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Create Account">
    </form>
    <div>
        <c:if test="${invalidUsername}">
            <small>Sorry, that username is already taken.</small>
        </c:if>
        <c:if test="${fieldsMissing}">
            <small>Please make sure all fields are completed.</small>
        </c:if>
    </div>
</div>
</body>
</html>
