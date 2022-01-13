<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${pageContext.request.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb"/>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="login" value="${pageContext.request.getParameter("login")}"/>
    <input type="hidden" name="path" value="/welcomePage.jsp"/>
    <input type="hidden" name="command" value="ADD_CAR"/>
    <br/>

    <label><fmt:message key="addCarPage2" bundle="${rb}"/>:
        <input type="text" name="model" value=""/>
    </label>
    <br/>
    <label><fmt:message key="addCarPage3" bundle="${rb}"/>:
        <input type="text" name="plate" value=""/>
    </label>
    <br/>
    <label><fmt:message key="addCarPage4" bundle="${rb}"/>:
        <input type="text" name="year" value=""/>
    </label>
    <br/>
    <label><fmt:message key="addCarPage5" bundle="${rb}"/>:
        <input type="text" name="mileage" value=""/>
    </label>
    <br/>
       <fmt:message key="addCarPage1" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
</body>
</html>
