<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
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
    <div class="form-group">
    <label><fmt:message key="registrationPage1" bundle="${rb}"/>:
        <input type="text" class="form-control" name="name" value=""/>
    </label>
    </div>
    <div class="form-group">
    <label><fmt:message key="registrationPage2" bundle="${rb}"/>:
        <input type="text" class="form-control" name="lastname" value=""/>
    </label>
    </div>
    <div class="form-group">
    <label><fmt:message key="registrationPage3" bundle="${rb}"/>:
        <input type="password" class="form-control" name="password" value=""/>
    </label>
    </div>
    <div class="form-group">
    <label><fmt:message key="registrationPage4" bundle="${rb}"/>:
        <input type="text" class="form-control" name="login" value=""/>
    </label>
    </div>
    <div class="form-group">
    <label><fmt:message key="registrationPage5" bundle="${rb}"/>:
        <input type="text" class="form-control" name="telephone" value=""/>
    </label>
    </div>
    ${nullDataForUser}
    <p></p>
    <fmt:message key="registrationPage6" var="msg" bundle="${rb}"/>
    <input type="submit" class="btn btn-success" value="${msg}"/>
</form>
</div>
</body>
</html>