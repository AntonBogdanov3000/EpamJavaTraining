<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<form>
    <input type="hidden" name="path" value="AdminPage.jsp"/>
    <input type="hidden" name="command" value="CREATE_CLEARANCE"/>
    <label><fmt:message key="clearanceCreatePage1" bundle="${rb}"/>:
        <select name="operation">
            <c:forEach items="${operationList}" var="operation">
                <option>${operation}</option>
            </c:forEach>
        </select>
    </label>
    <br>
    <label><fmt:message key="clearanceCreatePage2" bundle="${rb}"/>:
        <input type="text" name="name">
    </label>
    <br>
    <label><fmt:message key="clearanceCreatePage3" bundle="${rb}"/>:
        <input type="text" name="discount"/>
        </label>
    <br>
    <label><fmt:message key="clearanceCreatePage4" bundle="${rb}"/>:
    <input type="date" name="startDate"/>
    </label>
    <br>
    <label><fmt:message key="clearanceCreatePage5" bundle="${rb}"/>:
    <input type="date" name="endDate"/>
    </label>
    <br>
    <fmt:message key="clearanceCreatePage6" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
<body>

</body>
</html>
