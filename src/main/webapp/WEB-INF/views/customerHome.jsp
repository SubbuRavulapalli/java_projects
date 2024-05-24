<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Subbu's E-Commerce Site</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url("https://img.freepik.com/premium-photo/toy-shopping-cart-with-boxes-credit-card-with-copy-space_339191-197.jpg");
            background-position: center;
            background-size: cover;
            background-repeat: no-repeat;
        }

        nav {
            height: 70px;
            background-color: crimson;
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        h1 {
            font-weight: bold;
            font-size: 2rem;
            font-family: cursive;
            color: white;
            margin: 0;
        }

        form {
            margin: 10px;
        }

        button {
            padding: 10px 20px;
            background-color: #4CAF50;
            border: none;
            color: white;
            cursor: pointer;
            border-radius: 5px;
            font-size: 1rem;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #45a049;
        }

        .container {
            margin: 50px auto;
            text-align: center;
            color: white;
        }

        .container button {
            background-color: #008CBA;
        }

        .container button:hover {
            background-color: #0073e6;
        }

        .container form {
            display: inline-block;
        }

        .container form + form {
            margin-left: 20px;
        }
    </style>
</head>
<body>

<nav>
    <h1>Customer's Home Page</h1>
    <div class="container">
        <form action="login">
            <button type="submit">Log in</button>
        </form>
        <form action="cutomerForm">
            <button type="submit">Customer's Register</button>
        </form>

    </div>
</nav>

<%--<div class="container">--%>
<%--    <form action="productspage">--%>
<%--        <button type="submit" name="Products">Products</button>--%>
<%--    </form>--%>
<%--</div>--%>

</body>
</html>
