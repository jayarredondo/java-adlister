<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="McBurgers R' Us"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<div class="container">
    <h1>It's Burger Time!</h1>
    <div class="list-group">
        <c:forEach items="${allBurgers}" var="burger">
            <a href="/burgers/show?id=${burger.id}" class="list-group-item list-group-item-action">
                <strong>${burger.title}</strong> - ${burger.description}
            </a>
        </c:forEach>
    </div>
</div>
<%--could include a scripts jsp partial for CDN tags--%>
<%@include file="partials/scripts.jsp"%>
</body>
</html>
