
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="/welcomePage.jsp"/>
    <input type="hidden" name="command" value="LOGIN"/>
    <br/>
    <label>Enter Login
    <input type="text" name="login" value=""/>
    </label>
    <br/>
    <label>Enter password
    <input type="password" name="password" value=""/>
    </label>
    <br/>
    <input type="submit" value="Log In"/>
</form>

</body>
</html>
