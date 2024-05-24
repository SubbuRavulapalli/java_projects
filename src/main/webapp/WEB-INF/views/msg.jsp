<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-image: url("https://img.freepik.com/premium-photo/toy-shopping-cart-with-boxes-credit-card-with-copy-space_339191-197.jpg");
            background-position: center;
            background-size: cover;
        }
        table,th,td{
            border: 1px solid greenyellow;
        }
        img{
            height: 150px;
        }
    </style>
</head>
<body>
<center><h1>${msg}</h1></center>


<form action="index.jsp">
    <button type="submit">Home Page</button>
</form>
</body>
</html>
