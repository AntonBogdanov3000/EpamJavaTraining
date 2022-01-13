<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>

<html>
<head>
    <title>Title</title>
</head>
<body>
<fmt:message key="managerPage1" var="title_msg" bundle="${rb}"/>
<h2>${title_msg}</h2>
<br>
<form action="${pageContext.request.contextPath}/control">
    <input type="hidden" name="command" value=""/>
    <input type="hidden" name="number" value="2"/>
    <input type="hidden" name="role" value="1"/>
    <input type="hidden" name="path" value="/registration.jsp"/>
    <fmt:message key="managerPage2" var="msg" bundle="${rb}"/>
    <input type="submit" name="button" value="${msg}"/>
</form>
<br>
<form action="${pageContext.request.contextPath}/control">
    <input type="hidden" name="command" value="SHOW_PRICES"/>
    <input type="hidden" name="path" value="/CreateOrderPage.jsp"/>
    <fmt:message key="managerPage3" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
<br>
<form action="${pageContext.request.contextPath}/control">
    <input type="hidden" name="command" value="READ_USER_ORDER"/>
    <input type="hidden" name="path" value="/UpdateOrdersPage.jsp"/>
    <input type="text" name="login" value=""/>
    <fmt:message key="managerPage4" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
<br>
<form method="get">
    <input type="hidden" name="path" value="/main.jsp"/>
    <input type="hidden" name="command" value="LOGOUT"/>
    <fmt:message key="managerPage5" var="msg" bundle="${rb}"/>
    <input type="submit" name="logout" value="${msg}"/>
</form>
<br>
<form method="get">
    <input type="hidden" name="path" value="/OrderListPage.jsp"/>
    <input type="hidden" name="command" value="SHOW_ORDERS"/>
    <input type="hidden" name="idManager" value="${pageContext.request.getAttribute("idManager")}"/>
    <fmt:message key="managerPage6" var="msg" bundle="${rb}"/>
    <input type="submit" name="myOrders" value="${msg}"/>
</form>
</body>
</html>
