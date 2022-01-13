<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>

<html>
<head>
    <title></title>
</head>
<body>
<ul>
<c:forEach var="clearance" items="${clearanceList}">
    <li><c:out value="${clearance}"/>
        <form action="${pageContext.request.contextPath}/control" method="get">
            <input type="hidden" name="path" value="AdminPage.jsp"/>
            <input type="hidden" name="command" value="DELETE_CLEARANCE"/>
            <input type="hidden" name="delClear" value="${clearance.getId()}"/>
            <fmt:message key="clearanceListPage1" var="msg" bundle="${rb}"/>
            <input type="submit" value="${msg}"/>
        </form>
    </li>
</c:forEach>
</ul>
<br>
<form action="${pageContext.request.contextPath}/control" method="get">
    <input type="hidden" name="path" value="ClearanceCreatePage.jsp"/>
    <input type="hidden" name="command" value="SHOW_PRICES"/>
    <fmt:message key="clearanceListPage2" var="msg" bundle="${msg}"/>
    <input type="submit" value="${msg}"/>
</form>
</body>
</html>
