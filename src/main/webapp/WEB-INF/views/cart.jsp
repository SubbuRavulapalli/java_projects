<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 15-05-2024
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View</title>
    <style>
        /* CSS styles for product display */
        .product-container {
            border: 1px solid #ccc;
            margin-bottom: 20px;
            padding: 10px;
            width: 300px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
            background-color: #f9f9f9;
        }

        .product-info {
            margin-bottom: 10px;
            color: cadetblue;
        }
        img{
            height: 200px;
        }
        label{
            color: #05595a;
        }

        .product-info label {
            font-weight: bold;
        }

        .product-info span {
            margin-left: 10px;
        }
    </style>
</head>
<body>
<center><h1>CART PAGE.....</h1></center>
<c:forEach var="product" items="${add}">
    <div class="product-container">
        <div class="product-info">
            <span><img src="${product.image}"></span>
        </div>
        <div class="product-info">
            <label>Product Name:</label>
            <span>${product.productName}</span>
        </div>
        <div class="product-info">
            <label>Product Id:</label>
            <span>${product.productId}</span>
        </div>
        <div class="product-info">
            <label>Color:</label>
            <span>${product.color}</span>
        </div>
        <div class="product-info">
            <label>Gender:</label>
            <span>${product.gender}</span>
        </div>
        <div class="product-info">
            <label>Price :</label>
            <span>${product.price}</span>
        </div>
        <form action="remove" >
            <input type="hidden" value="${product.productId}" name="productId">
            <button type="submit">Remove</button>
        </form>
    </div>
</c:forEach>

<form action="getAddress">
<%--    <input type="hidden" value="${product.productId}" name="productId">--%>
    <h3>Total Price :${total}</h3>
    <button type="submit">Check Out</button>
</form>

</body>
</html>
