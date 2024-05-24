<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-image: url("https://wallpapercave.com/wp/PR88f2j.gif");
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
<center><h1>${name}<br>${msg}</h1></center>
<br><br><br><br>

<table>
    <tr>
        <th>Name of the Product</th>
        <th>product Pice</th>
    </tr>
    <c:forEach var="pro" items="${products}">
        <tr>
            <td>${pro.productName}</td>
            <td>${pro.price}</td>
            <td><img src="${pro.image}"></td>
        </tr>
    </c:forEach>
</table>

<%--<h3>${products}</h3>--%>
<h1>Your Order Price is :${data}</h1>

<form action="index.jsp">
    <button type="submit">Home Page</button>
</form>
</body>
</html>
