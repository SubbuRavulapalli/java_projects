<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        img{
            height: 200px;
        }

        table {
            width: 50%;
            margin: 20px auto;
            border-collapse: collapse;
            border: 1px solid #ddd;
            background-color: #fff;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        form {
            margin-top: 20px;
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th colspan="2">Product Details</th>
    </tr>
    <tr>
        <td>Product ID</td>
        <td>${product.productId}</td>
    </tr>
    <tr>
        <td>Product Name</td>
        <td>${product.productName}</td>
    </tr>
    <tr>
        <td>Product Brand</td>
        <td>${product.productBrand}</td>
    </tr>
    <tr>
        <td>Image</td>
        <td><img src="${product.image}"></td>
    </tr>
    <tr>
        <td>Gender</td>
        <td>${product.gender}</td>
    </tr>
    <tr>
        <td>Price</td>
        <td>${product.price}</td>
    </tr>
    <tr>
        <td>Color</td>
        <td>${product.color}</td>
    </tr>
    <tr>
        <td>Description</td>
        <td>${product.description}</td>
    </tr>
    <tr>
        <td>
            <form action="addTocart">
                <input type="hidden" value="${product.productId}" name="productId">
                <button type="submit">Add To Cart</button>
            </form>
        </td>
    </tr>
</table>
</body>
</html>
