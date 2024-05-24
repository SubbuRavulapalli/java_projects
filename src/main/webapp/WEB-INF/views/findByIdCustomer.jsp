<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17-04-2024
  Time: 11:22
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
        <h1>Search Customer By Id</h1>
        <form action="customerFetchbyId" method="get">
            Please Enter Your id :
            <input type="number" name="id"/>
            <input type="submit">
        </form>
        <br><br><br><br>

    </div>
</center>
<form action="index.jsp">
    <button type="submit">Home Page</button>
</form>
</body>
</html>
