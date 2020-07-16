<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/16/20
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">>
        <jsp:param name="title" value="${burger.title} Details"/>
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp"/>
<div class="container">
    <h1>${burger.title} Details</h1>
    <div class="list-group">
        <c:forEach items="${burger.ingredients}" var="ingredient">
            <a href="#" class="list-group-item list-group-item-action">
                <strong>${ingredient.title}</strong>
            </a>
        </c:forEach>
    </div></div>
</body>
</html>
