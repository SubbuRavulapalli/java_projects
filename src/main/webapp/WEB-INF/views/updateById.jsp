<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 18-04-2024
  Time: 17:43
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
        <h1>Update Product By Id</h1>

        <br><br><br><br>
        <form action="updateForm" method="get">
            <table>
                <tr>
                    <th> Please Enter Your id To Update :</th>
                </tr>
                <br>
                <tr>
                    <td> <input type="number" name="productId"/></td>
                </tr>
                <br>
                <tr> <input type="submit"></tr>
                <br>
            </table>
        </form>
    </div>
</center>
<form action="index.jsp">
    <button type="submit">Home Page</button>
</form>
</body>
</html>
