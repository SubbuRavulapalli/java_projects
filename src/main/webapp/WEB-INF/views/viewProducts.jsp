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
        img{
            height: 200px;
        }

        .product-info {
            margin-bottom: 10px;
            color: cadetblue;
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
<c:forEach var="product" items="${products}">
    <div class="product-container">
        <div class="product-info">
            <span><img src="${product.image}"></span>
        </div>
        <div class="product-info">
            <label>Product Name:</label>
            <span>${product.productName}</span>
        </div>
        <div class="product-info">
            <label>Product Brand:</label>
            <span>${product.productBrand}</span>
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
            <label>Price:</label>
            <span>${product.price}</span>
        </div>
        <br>
        <br>
        <form action="fetchById">
            <input type="hidden" value="${product.productId}" name="productId">
            <button type="submit">View Details</button>
        </form>
    </div>
</c:forEach>

</body>
</html>
