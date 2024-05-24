<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 16-04-2024
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        form{
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

<%--@elvariable id="product" type=""--%>
<center>

<form:form modelAttribute="product" action="/JdbcTemplate_war_exploded/save" method="post">
    <center><h4>Insert Product</h4></center>
    <table>
        <tr>
            <td> productId :</td>
            <td> <form:input path="productId"/><br><br><br></td>
        </tr>
        <tr>
            <td>product name :</td>
            <td><form:input path="productName"/><br><br><br></td>
        </tr>
        <tr>
            <td> product Brand :</td>
            <td> <form:input path="productBrand"/><br><br><br></td>
        </tr>
        <tr>
            <td>gender :</td>
            <td><form:input path="gender"/><br><br><br></td>
        </tr>
        <tr>
            <td>color :</td>
            <td><form:input path="color"/></td><br><br>
        </tr>
        <tr>
            <td>price :</td>
            <td><form:input path="price"/></td><br><br>
        </tr>
        <tr>
            <td>description :</td>
            <td><form:input path="description"/></td><br><br>
        </tr>
        <tr>
            <td>Image Url :</td>
            <td><form:input path="image"/></td><br><br>
        </tr>
        <tr><td> <input type="submit" name="SAVE"></td></tr>
    </table>
</form:form>
</center>


</body>
</html>
