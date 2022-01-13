<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>

<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<form action="${pageContext.request.contextPath}/control" method="post">

    <input type="hidden" name="command" value="REGISTRATION"/>
    <input type="hidden" name="role" value="${pageContext.request.getParameter("role")}"/>

    <c:set var="number" value="${pageContext.request.getParameter('number')}"/>

    <c:if test="${number == 1}">
        <input type="hidden" name="path" value="/welcomePage.jsp"/>
    </c:if>
    <c:if test="${number == 3}">
        <input type="hidden" name="path" value="/AdminPage.jsp"/>
    </c:if>
    <c:if test="${number == 2}">
        <input type="hidden" name="path" value="/ManagerPage.jsp"/>
    </c:if>
    <br/>
    <label><fmt:message key="registrationPage1" bundle="${rb}"/>:
        <input type="text" name="name" value=""/>
    </label>
    <br/>
    <label><fmt:message key="registrationPage2" bundle="${rb}"/>:
        <input type="text" name="lastname" value=""/>
    </label>
    <br/>
    <label><fmt:message key="registrationPage3" bundle="${rb}"/>:
        <input type="password" name="password" value=""/>
    </label>
    <br/>
    <label><fmt:message key="registrationPage4" bundle="${rb}"/>:
        <input type="text" name="login" value=""/>
    </label>
    <br/>
    <label><fmt:message key="registrationPage5" bundle="${rb}"/>:
        <input type="text" name="telephone" value=""/>
    </label>
    <br/>
    <fmt:message key="registrationPage6" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
</body>
</html>