<%@ page language="java" contentType="text/html; ISO-8859-1 charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>user details Jsp page</title>
</head>
<body>
<h2> Hello this is the user-detail.jsp page </h2>
${regObject}<br><br>
username : ${regObject.name}<br><br>
email : ${regObject.email}<br><br>
password : ${regObject.password}<br><br>
gender : ${regObject.gender}<br><br>
hobbies : ${regObject.hobby[0]}, ${regObject.hobby[1]}<br><br>

</body>
</html>
