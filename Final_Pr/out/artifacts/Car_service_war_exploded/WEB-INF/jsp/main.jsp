<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container-fluid">
    <h1><p class="bg-primary">Personal car service</p></h1>
</div>
<div class="row">
    <div class="col-md-4" >
        <form action="${pageContext.request.contextPath}/control" method="post">
            <input type="hidden" name="path" value="registration.jsp"/>
            <input type="hidden" name="command" value=""/>
            <input type="hidden" name="role" value="1"/>
            <input type="submit" value="Registration"/>
        </form>
    </div>
    <div class="col-md-4">
        <form action="${pageContext.request.contextPath}/control" method="get">
            <input type="hidden" name="path" value="PriceListPage.jsp"/>
            <input type="hidden" name="command" value="SHOW_PRICES"/>
            <input type="submit" value="PriceList"/>
        </form>
    </div>
    <div class="col-md-4">
    <form action="${pageContext.request.contextPath}/control" method="post">
        <input type="hidden" name="path" value="LogInPage.jsp"/>
        <input type="hidden" name="command" value=""/>
        <input type="submit" value="Log in"/>
    </form>
    </div>
</div>
</body>
</html>