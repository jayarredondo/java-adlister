<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/14/20
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User1 Profile</title>
</head>
<body>
    <h1>Welcome to <%=request.getParameter("username")%>'s profile!</h1>
    <h3>His favorite color is: <%=request.getParameter("favoriteColor")%></h3>
</body>
</html>
