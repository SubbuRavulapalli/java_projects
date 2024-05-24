<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17-04-2024
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        table,tr,th,td{
            border: 2px solid violet;
            border-collapse: collapse;
        }
        table{
            width: 70%;
        }
        body{
            background-image: url("https://img.freepik.com/premium-photo/toy-shopping-cart-with-boxes-credit-card-with-copy-space_339191-197.jpg");
            background-position: center;
            background-size: cover;
        }
        th{
            background-color: cadetblue;
        }
    </style>
</head>
<body>
<center>
    <h1>Product Details.....</h1>
    <table>
        <tr>
            <th>productId</th>
            <th>productName</th>
            <th>productBrand</th>
            <th>gender</th>
            <th>color</th>
            <th>price</th>
            <th>Description</th>
        </tr>

        <tr>
            <td>${product.productId}</td>
            <td>${product.productName}</td>
            <td>${product.prouctBrand}</td>
            <td>${product.gender}</td>
            <td>${product.color}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
        </tr>
    </table>
</center>
<form action="index.jsp">
    <button type="submit">Home Page</button>
</form>
</body>
</html>
