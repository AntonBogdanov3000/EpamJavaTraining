<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>

<html>
<head>
    <fmt:message key="clientListPage3" var="title_msg" bundle="${rb}"/>
    <title>${title_msg}</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/control" method="post">
    <c:forEach var="client" items="${clientList}" >
        <li><c:out value="${client}"/></li>
        <form>
            <input type="hidden" name="path" value="AdminPage.jsp">
            <input type="hidden" name="command" value="DELETE_USER">
            <input type="hidden" name="delUser" value="${client.getId()}"/>
            <fmt:message key="clientListPage1" var="msg" bundle="${rb}"/>
            <input type="submit" value="${msg}"/>
        </form>
        <form>
            <input type="hidden" name="path" value="UserUpdatePage.jsp">
            <input type="hidden" name="command" value="UPDATE_USER"/>
            <input type="hidden" name="upd" value="upd"/>
            <input type="hidden" name="updUser" value="${client.getId()}"/>
            <fmt:message key="clientListPage2" var="msg" bundle="${rb}"/>
            <input type="submit" value="${msg}"/>
        </form>
    </c:forEach>
</form>
</body>
</html>

