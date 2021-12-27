
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="login" value="${pageContext.request.getParameter("login")}"/>
    <input type="hidden" name="path" value="/welcomePage.jsp"/>
    <input type="hidden" name="command" value="ADD_CAR"/>
    <br/>
    <label>Model:
        <input type="text" name="model" value=""/>
    </label>
    <br/>
    <label>Plate:
        <input type="text" name="plate" value=""/>
    </label>
    <br/>
    <label>Year:
        <input type="text" name="year" value=""/>
    </label>
    <br/>
    <label>Mileage:
        <input type="text" name="mileage" value=""/>
    </label>
    <br/>
    <input type="submit" value="Add a Car"/>
</form>
</body>
</html>
