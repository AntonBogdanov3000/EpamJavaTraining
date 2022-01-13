<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>


<html>
<head>
    <title></title>
</head>
<body>
<fmt:message key="adminPage1" var="msg" bundle="${rb}"/>
<h3>${msg}</h3>

<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="AdminUpdateOrdersPage.jsp"/>
    <input type="hidden" name="idManager" value=""/>
    <input type="hidden" name="command" value="SHOW_ORDERS"/>
    <fmt:message key="adminPage2" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="ClientsListPage.jsp"/>
    <input type="hidden" name="role" value="1">
    <input type="hidden" name="command" value="SHOW_CLIENTS"/>
    <fmt:message key="adminPage3" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="ClientsListPage.jsp"/>
    <input type="hidden" name="role" value="2"/>
    <input type="hidden" name="command" value="SHOW_CLIENTS"/>
    <fmt:message key="adminPage4" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="registration.jsp"/>
    <input type="hidden" name="command" value=""/>
    <input type="hidden" name="number" value="3"/>
    <input type="hidden" name="role" value="2"/>
    <fmt:message key="adminPage5" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="ClearanceListPage.jsp"/>
    <input type="hidden" name="command" value="SHOW_ALL_CLEARANCE"/>
    <fmt:message key="adminPage6" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
<form method="get">
    <input type="hidden" name="path" value="/main.jsp"/>
    <input type="hidden" name="command" value="LOGOUT"/>
    <fmt:message key="adminPage7" var="msg" bundle="${rb}"/>
    <input type="submit" name="logout" value="${msg}"/>
</form>
</body>
</html>
