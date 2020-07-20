<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/20/20
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="View Car Advertisements"/>
    </jsp:include>
</head>
<body>
<%@include file="../partials/navbar.jsp"%>
<div class="container">
    <h1>Cars Listed For Sale:</h1>
    <c:forEach items="${cars}" var="car">
        <div class="col-md-6">
            <h2>${car.make} ${car.model}</h2>
            <p>${car.year}</p>
        </div>
    </c:forEach>
</div>
</body>
</html>
