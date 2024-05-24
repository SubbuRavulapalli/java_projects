<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 18-04-2024
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        div{
            background-color: darkturquoise;
            height: 400px;
            width: 30%;
            align-content: center;
        }
        input{
            height: auto;
        }
        body{
            background-image: url("https://img.freepik.com/premium-photo/toy-shopping-cart-with-boxes-credit-card-with-copy-space_339191-197.jpg");
            background-position: center;
            background-size: cover;
        }
    </style>
</head>
<body>
<center>
    <div>
        <h1>Delete Product By Id</h1>

        <br><br><br><br>
        <form action="delete" method="get">
            Please Enter Your id To Delete :
            <input type="number" name="productId"/>
            <input type="submit">
        </form>
    </div>
</center>
<form action="index.jsp">
    <button type="submit">Home Page</button>
</form>

</body>
</html>
