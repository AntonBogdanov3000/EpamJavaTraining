<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>

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
                <input type="hidden" name="updOrder" value="${order.getId()}"/>
                <fmt:message key="ordersToUpdatePage1" var="msg" bundle="${rb}"/>
                <input type="submit" value="${msg}"/>
            </form>
        </li>
    </c:forEach>
</ul>
</body>
</html>
