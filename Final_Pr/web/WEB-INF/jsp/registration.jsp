<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<form action="${pageContext.request.contextPath}/control" method="post">
    <input type="hidden" name="path" value="/welcomePage.jsp"/>
    <input type="hidden" name="command" value="REGISTRATION"/>
    <br/>
    <label>Name:
        <input type="text" name="name" value=""/>
    </label>
    <br/>
    <label>Lastname:
        <input type="text" name="lastname" value=""/>
    </label>
    <br/>
    <label>Password:
        <input type="password" name="password" value=""/>
    </label>
    <br/>
    <label>Login:
        <input type="text" name="login" value=""/>
    </label>
    <br/>
    <label>Telephone:
        <input type="text" name="telephone" value=""/>
    </label>
    <br/>
    <input type="submit" value="Confirm"/>
</form>
</body>
</html>