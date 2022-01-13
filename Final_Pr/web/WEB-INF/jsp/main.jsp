<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="lang" value="${pageContext.session.getAttribute('locale')}"/>
<c:if test="${lang == null}">
    <fmt:setLocale value="en_EN"/>
</c:if>
<c:if test="${lang != null}">
    <fmt:setLocale value="${pageContext.session.getAttribute('locale')}"/>
</c:if>
<fmt:setBundle basename="text" var="rb" scope="session"/>

<html>
<head>
    <title>Welcome</title>

</head>
<body>

    <h1><fmt:message key="mainPage4" bundle="${rb}"/></h1>

        <form action="${pageContext.request.contextPath}/control" method="post">
            <input type="hidden" name="path" value="registration.jsp"/>
            <input type="hidden" name="command" value=""/>
            <input type="hidden" name="number" value="1"/>
            <input type="hidden" name="role" value="1"/>
            <fmt:message key="mainPage1" var="msg" bundle="${rb}"/>
            <input type="submit" value="${msg}"/>
        </form>
    <br>
        <form action="${pageContext.request.contextPath}/control" method="get">
            <input type="hidden" name="path" value="PriceListPage.jsp"/>
            <input type="hidden" name="command" value="SHOW_PRICES"/>
            <fmt:message key="mainPage2" var="msg" bundle="${rb}"/>
            <input type="submit" value="${msg}"/>
        </form>
    <br>
    <form action="${pageContext.request.contextPath}/control" method="post">
        <input type="hidden" name="path" value="LogInPage.jsp"/>
        <input type="hidden" name="command" value=""/>
        <input type="hidden" name="locale" value="${pageContext.session.getAttribute('locale')}">
        <fmt:message key="mainPage3" var="msg" bundle="${rb}"/>
        <input type="submit" value="${msg}"/>
    </form>
    <br>
    <form action="${pageContext.request.contextPath}/control" method="post">
        <input type="hidden" name="command" value="CHANGE_LANG"/>
        <input type="hidden" name="path" value="main.jsp"/>
        <select name="language">
            <option value="english" ${language eq 'english' ? 'selected' : ''}>English</option>
            <option value="russian" ${language eq 'russian' ? 'selected' : ''}>Русский</option>
            <option value="deutsch" ${language eq 'deutsch' ? 'selected' : ''}>Deutsch</option>
        </select>
        <fmt:message key="mainPage5" var="msg" bundle="${rb}"/>
        <input type="submit" value="${msg}">
    </form>
</body>
</html>