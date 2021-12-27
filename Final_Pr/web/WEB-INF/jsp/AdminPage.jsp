
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Hello admin</h3>

<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="OrderListPage.jsp"/>
    <input type="hidden" name="command" value="SHOW_ORDERS"/>
    <input type="submit" value="Show all orders"/>
</form>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="ClientsListPage.jsp"/>
    <input type="hidden" name="role" value="1">
    <input type="hidden" name="command" value="SHOW_CLIENTS"/>
    <input type="submit" value="Show all clients"/>
</form>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="ClientsListPage.jsp"/>
    <input type="hidden" name="role" value="2">
    <input type="hidden" name="command" value="SHOW_CLIENTS"/>
    <input type="submit" value="Show all managers"/>
</form>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="registration.jsp"/>
    <input type="hidden" name="command" value=""/>
    <input type="hidden" name="role" value="2"/>
    <input type="submit" value="Create a manager"/>
</form>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="ClearanceListPage.jsp"/>
    <input type="hidden" name="command" value="SHOW_ALL_CLEARANCE"/>
    <input type="submit" value="Show all clearance"/>
</form>
<form method="get">
    <input type="hidden" name="path" value="/main.jsp"/>
    <input type="hidden" name="command" value="LOGOUT"/>
    <input type="submit" name="logout" value="Logout"/>
</form>
</body>
</html>
