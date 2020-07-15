<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/15/20
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
        <c:choose>
    <form action="login.jsp" method="POST">
        <h3>Please Login</h3>
        <label for="username">Username: </label><input type="text" name="username" id="username"><br>
        <label for="password">Password: </label><input type="password" name="password" id="password">
        <button type="submit">Login</button>
            <c:when test="${param.username.equalsIgnoreCase('admin')} ${param.password.equalsIgnoreCase('password')}">
                <p>The username you entered is: ${param.username}</p>
            </c:when>
            <c:otherwise>
                <p>${paramValues}</p>
            </c:otherwise>
        </c:choose>
    </form>
</body>
</html>
