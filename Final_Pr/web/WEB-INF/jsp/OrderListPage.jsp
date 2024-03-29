<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>My orders</h2>
    <table class="table table-striped">
        <thead>
        <tr>
        <th>Date</th>
        <th>Price</th>
        <th>Operations</th>
        <th>Car</th>
        </tr>
        </thead>
        <tbody>
    <c:forEach var="order" items="${orderList}">
        <tr>
        <td>${order.getDate()}</td>
        <td>${order.getPrice()}</td>
        <td>${order.getOperationList()}</td>
        <td>${order.getVehicle().getModel()}</td>
        </tr>
    </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
