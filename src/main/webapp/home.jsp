<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/14/20
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! String firstName = "Jay";%>
<%! String lastName = "Arredondo";%>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <%@ include file="partials/navbar.jsp"%>
    <h1>Hello <%=firstName%> <%=lastName%>!</h1>
    <h3>Menu</h3>

    <h4>View Your Profile</h4>
    <form action="profile.jsp" method="GET">
        <input type="hidden" id="username" name="username" value="Jay">
        <p>Pick your favorite color:</p>
        <label for="royalBlue"></label>Royal Blue<input type="radio" id="royalBlue" name="favoriteColor" value="Royal Blue">
        <label for="rubyRed"></label>Ruby Red<input type="radio" id="rubyRed" name="favoriteColor" value="Ruby Red">
        <label for="macaroniOrange"></label>Macaroni Orange<input type="radio" id="macaroniOrange" name="favoriteColor" value="Macaroni Orange">
        <button type="submit">Visit Profile</button>
    </form>
    <h4>Add a To-Do</h4>
    <form action="partials/todo.jsp" method="POST">
        <input type="text" id="item" name="item"><br>

        <button type="submit">Add to List</button>
    </form>
    <%@ include file="partials/aboutme.jsp"%>
    <%@ include file="partials/footer.jsp"%>
</body>
</html>
