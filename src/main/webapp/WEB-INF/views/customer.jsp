<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17-04-2024
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, tr, th, td {
            border: 2px solid violet;
            border-collapse: collapse;
        }

        table {
            width: 70%;
        }

        body {
            background-image: url("https://img.freepik.com/premium-photo/toy-shopping-cart-with-boxes-credit-card-with-copy-space_339191-197.jpg");
            background-position: center;
            background-size: cover;
        }

        th {
            background-color: cadetblue;
        }
    </style>
</head>
<body>
<center>
    <h1>Product Details.....</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Role</th>
            <th>Email</th>
            <th>Phone</th>
        </tr>

        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.role}</td>
            <td>${customer.email}</td>
            <td>${customer.phone}</td>
        </tr>
    </table>
</center>
<form action="index.jsp">
    <button type="submit">Home Page</button>
</form>
</body>
</html>
