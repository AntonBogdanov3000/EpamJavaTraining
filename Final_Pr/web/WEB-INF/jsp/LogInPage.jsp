<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>


<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="command" value="LOGIN"/>
    <br/>
    <label><fmt:message key="loginPage1" bundle="${rb}"/>
    <input type="text" name="login" value=""/>
    </label>
    <br/>
    <label><fmt:message key="loginPage2" bundle="${rb}"/>
    <input type="password" name="password" value=""/>
    </label>
    <br/>
    <fmt:message key="loginPage3" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>

</body>
</html>
