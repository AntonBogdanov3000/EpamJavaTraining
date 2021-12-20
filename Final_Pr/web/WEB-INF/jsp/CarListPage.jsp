<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
   <c:forEach var="vehicle" items="${vehicleList}">
       <li><c:out value="${vehicle}"/></li>
   </c:forEach>
</ul>
<br/>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="login" value="${pageContext.request.getParameter("login")}"/>
    <input type="hidden" name="command" value=""/>
    <input type="hidden" name="path" value="/AddCarPage.jsp"/>
    <input type="submit" name="addCar" value="Add car">
</form>
</body>
</html>
