<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ClientList</title>
</head>
<body>
    <c:forEach var="client" items="${clientList}">
        <li><c:out value="${client}"/>
            <input type="submit" value="update client">
            <input type="submit" value="delete client"></li>
    </c:forEach>
</body>
</html>

