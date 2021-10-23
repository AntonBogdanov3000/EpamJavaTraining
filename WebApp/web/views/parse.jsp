<%@ page import="app.entities.Medicines" %>
<%@ page import="app.service.DomParser.MedicinesDOMBuilder" %><%--
  Created by IntelliJ IDEA.
  User: Оксана
  Date: 20.10.2021
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DOMParser</title>
</head>
<body>
<ul>
    <%
        MedicinesDOMBuilder builder = (MedicinesDOMBuilder) request.getAttribute("DOM");
        for (Medicines med : builder.getMedicines()) {
            out.println("<li>" + med + "</li>");
        }
    %>
</ul>
</body>
</html>
