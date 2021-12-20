<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h3>Welcome </h3>
<hr/>

<form action="${pageContext.request.contextPath}/control" method="post">
 <input type="hidden" name="login" value="${pageContext.request.getParameter("login")}"/>
 <input type="hidden" name="path" value="/OrderListPage.jsp"/>
 <input type="hidden" name="command" value="READ_USER_ORDER"/>
 <input type="submit" name="orders" value="Orders history"/>
</form>
<br>
<br>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="login" value="${pageContext.request.getParameter("login")}"/>
    <input type="hidden" name="path" value="/CarListPage.jsp"/>
    <input type="hidden" name="command" value="READ_USER_CAR"/>
    <input type="submit" name="cars" value="Your garage"/>
</form>
<br>
<form>
    <input type="hidden" name="login" value="${pageContext.request.getParameter("login")}"/>
    <input type="hidden" name="path" value="/main.jsp"/>
    <input type="hidden" name="command" value="LOGOUT"/>
    <input type="submit" name="logout" value="Logout"/>
</form>
<br>

</body>
</html>
