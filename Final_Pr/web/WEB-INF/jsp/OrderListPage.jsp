<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach var="order" items="${orderList}">
        <li><c:out value="${order}"/></li>
    </c:forEach>
</ul>
</body>
</html>
