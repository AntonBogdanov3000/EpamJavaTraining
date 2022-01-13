<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>

<html>
<head>
    <title>Hello</title>
</head>
<body>
<fmt:message key="welcomePage1" var="title_msg" bundle="${rb}"/>
<h3>${title_msg}</h3>
<hr/>

<form action="${pageContext.request.contextPath}/control" method="post">
 <input type="hidden" name="login" value="${pageContext.request.getParameter("login")}"/>
 <input type="hidden" name="path" value="/OrderListPage.jsp"/>
 <input type="hidden" name="command" value="READ_USER_ORDER"/>
 <fmt:message key="welcomePage2" var="msg" bundle="${rb}"/>
 <input type="submit" name="orders" value="${msg}"/>
</form>
<br>
<br>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="login" value="${pageContext.request.getParameter("login")}"/>
    <input type="hidden" name="path" value="/CarListPage.jsp"/>
    <input type="hidden" name="command" value="READ_USER_CAR"/>
    <fmt:message key="welcomePage3" var="msg" bundle="${rb}"/>
    <input type="submit" name="cars" value="${msg}"/>
</form>
<br>
<form>
    <input type="hidden" name="login" value="${pageContext.request.getParameter("login")}"/>
    <input type="hidden" name="path" value="/main.jsp"/>
    <input type="hidden" name="command" value="LOGOUT"/>
    <fmt:message key="welcomePage4" var="msg" bundle="${rb}"/>
    <input type="submit" name="logout" value="${msg}"/>
</form>
<br>

</body>
</html>
