<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17-04-2024
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
    <style>
        table,th,tr,td{
            border-collapse: collapse;
            border: 3px solid aqua;
        }
        table{
            width: 70%;
        }
        body{
            /*background-image: url("https://img.freepik.com/premium-photo/toy-shopping-cart-with-boxes-credit-card-with-copy-space_339191-197.jpg");*/
            background-color: white;
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
    <h1>All Products Details.....</h1>
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
        <c:forEach var="pro" items="${products}">
            <tr>
                <td>${pro.productId}</td>
                <td>${pro.productName}</td>
                <td>${pro.productBrand}</td>
                <td>${pro.gender}</td>
                <td>${pro.color}</td>
                <td>${pro.price}</td>
                <td>${pro.description}</td>
            </tr>
        </c:forEach>
    </table>
</center>
<br><br><br><br>
<form action="index.jsp">
    <button type="submit">Home Page</button>
</form>
</body>
</html>
