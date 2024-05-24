<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 19-04-2024
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url("https://img.freepik.com/premium-photo/family-walks-together-green-meadow-towards-sunset_255755-8152.jpg?w=1480");
            background-position: center;
            /*background-size: cover;*/
            background-repeat: no-repeat;
        }

        nav {
            height: 70px;
            background-color: #0a572b;
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
        <form action="cartPage">
<%--            <input type="hidden" name="id" value="${cus.id}">--%>
            <button type="submit">Cart Page</button>
        </form>

        <form action="signout">
            <button type="submit">Log Out</button>
        </form>

    </div>
</nav>

<div class="container">
    <jsp:include page="/viewAll"/>
</div>


</body>
</html>
