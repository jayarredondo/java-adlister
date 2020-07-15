<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/14/20
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setAttribute("username", request.getParameter("username"));%>
<html>
<head>
    <%@include file="partials/head.jsp"%>
    <title>Your Profile</title>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
    <h1>Welcome to ${username}'s profile!</h1>
<%@include file="partials/footer.jsp"%>
</body>
</html>
