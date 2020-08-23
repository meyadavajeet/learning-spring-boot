<%@ page language="java" contentType="text/html; ISO-8859-1 charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Registration Jsp page</title>
</head>
<body>
<h1>User Registration form</h1>
<%--<form action="view-details">--%>
<form action="create-user">
    username :<input type="text" name="name"><br>
    email : <input type="email" name="email"> <br>
    password: <input type="password" name="password"><br>
    Gender <input type="radio" name="gender" value="1" checked/>Male
    <input type="radio" name="gender" value="2" checked/>Female
    <br>
    <input type="checkbox" name="hobby" value="Dancing">Dancing
    <input type="checkbox" name="hobby" value="singing">singing
    <br><br>
    <input type="submit" name="submit" value="Register now">
    <br><br>
    <i>thank you</i>
</form>
</body>
</html>
