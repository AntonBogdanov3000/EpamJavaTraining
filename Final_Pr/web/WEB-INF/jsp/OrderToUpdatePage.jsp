<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="/ManagerPage.jsp"/>
    <input type="hidden" name="command" value="UPDATE_ORDER"/>
    <input type="hidden" name="order" value="${pageContext.request.getParameter("update")}"/>
    <br>
    <select name="operation">
        <c:forEach items="${operationList}" var="operation">
            <option>${operation}</option>
        </c:forEach>
    </select>
    <br>
    <input type="submit" value="Confirm"/>
</form>
</body>
</html>
