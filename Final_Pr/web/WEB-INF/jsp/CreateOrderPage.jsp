<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="/ManagerPage.jsp"/>
    <input type="hidden" name="command" value="CREATE_ORDER"/>
    <br>
<label>Client login:
   <input type="text" name="login" value=""/>
</label>
    <br>
<label>Client car plate:
    <input type="text" name="vehicle" value=""/>
    </label>
<br>
    <select name="operation">
        <c:forEach items="${operationList}" var="operation">
            <option>${operation}</option>
        </c:forEach>
    </select>
    <br>
<label>Total cost:
    <input type="text" name="price" value=""/>
</label>
    <br>
    <input type="submit" value="Create order">
</form>
</body>
</html>
