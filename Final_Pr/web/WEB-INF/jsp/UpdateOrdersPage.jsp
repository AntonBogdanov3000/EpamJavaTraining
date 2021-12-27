<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach var="order" items="${orderList}">
        <li><c:out value="${order}"/>
            <form action="${pageContext.request.contextPath}/control">
                <input type="hidden" name="path" value="/OrderToUpdatePage.jsp"/>
                <input type="hidden" name="command" value="SHOW_PRICES"/>
                <input type="hidden" name="update" value="${order}"/>
                <input type="submit" value="Add an operation"/>
            </form>
        </li>
    </c:forEach>
</ul>
</body>
</html>
