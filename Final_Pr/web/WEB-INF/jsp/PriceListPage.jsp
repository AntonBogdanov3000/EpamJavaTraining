<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach var="operation" items="${operationList}">
        <li><c:out value="${operation}"/></li>
    </c:forEach>
</ul>
</body>
</html>
