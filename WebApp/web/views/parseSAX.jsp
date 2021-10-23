<%@ page import="app.service.SAXParser.MedicinesSAXBuilder" %>
<%@ page import="app.entities.Medicines" %><%--
  Created by IntelliJ IDEA.
  User: Оксана
  Date: 23.10.2021
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SAXParser</title>
</head>
<body>
<ul>
    <%
        MedicinesSAXBuilder builder = (MedicinesSAXBuilder) request.getAttribute("SAX");
        for (Medicines med : builder.getMedicines()) {
            out.println("<li>" + med + "</li>");
        }
    %>
</ul>
</body>
</html>
