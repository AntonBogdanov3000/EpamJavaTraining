
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello manager</h2>
<br>
<form action="${pageContext.request.contextPath}/control">
    <input type="hidden" name="command" value=""/>
    <input type="hidden" name="path" value="/registration.jsp"/>
    <input type="submit" value="Create client"/>
</form>
<br>
<form action="${pageContext.request.contextPath}/control">
    <input type="hidden" name="command" value="SHOW_PRICES"/>
    <input type="hidden" name="path" value="/CreateOrderPage.jsp"/>
    <input type="submit" value="Create order"/>
</form>
<br>
<form action="${pageContext.request.contextPath}/control">
    <input type="hidden" name="command" value="READ_USER_ORDER"/>
    <input type="hidden" name="path" value="/UpdateOrdersPage.jsp"/>
    <input type="text" name="login" value=""/>
    <input type="submit" value="View client orders"/>
</form>
<br>
<form method="get">
    <input type="hidden" name="path" value="/main.jsp"/>
    <input type="hidden" name="command" value="LOGOUT"/>
    <input type="submit" name="logout" value="Logout"/>
</form>
</body>
</html>
