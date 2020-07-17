<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/16/20
  Time: 6:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="View Advertisements"/>
    </jsp:include>
</head>
<body>
<div class="container">
    <h1>Here are your Advertisements!</h1>
    <c:forEach items="${ads}" var="ad">
        <div class="row">
            <div class="col">
                <h2>${ad.title}</h2>
                <p>${ad.description}</p>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>
