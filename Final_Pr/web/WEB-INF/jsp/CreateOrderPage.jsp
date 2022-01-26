<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
<fmt:setBundle basename="text" var="rb" scope="session"/>

<!DOCTYPE html>
<body>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="/ManagerPage.jsp"/>
    <input type="hidden" name="manager" value="${pageContext.request.getAttribute("manager")}"/>
    <input type="hidden" name="command" value="CREATE_ORDER"/>
    <br>
<label><fmt:message key="createOrderPage1" bundle="${rb}"/>:
   <input type="text" name="login" value=""/>
</label>
    <br>
<label><fmt:message key="createOrderPage2" bundle="${rb}"/>:
    <input type="text" name="vehicle" value=""/>
    </label>
<br>
    <select name="operation">
        <c:forEach items="${operationList}" var="operation">
            <option>${operation}</option>
        </c:forEach>
    </select>
    <br>
<label><fmt:message key="createOrderPage3" bundle="${rb}"/>:
    <input type="text" name="price" value=""/>
</label>
    <br>
    <fmt:message key="createOrderPage4" var="msg" bundle="${rb}"/>
    <input type="submit" value="${msg}"/>
</form>
</body>
</html>
