<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Admin</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url("https://img.freepik.com/premium-photo/toy-shopping-cart-with-boxes-credit-card-with-copy-space_339191-197.jpg");
            background-position: center;
            background-size: cover;
        }

        .container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background-color: rgba(0, 128, 128, 0.8);
            padding: 20px;
            border-radius: 10px;
            width: 30%;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
        }

        h4 {
            color: white;
            text-align: center;
            margin-bottom: 30px;
        }

        input[type="text"], input[type="password"], input[type="email"], input[type="tel"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #008080;
            border: none;
            border-radius: 5px;
            color: white;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #006666;
        }

        .error {
            color: red;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="form-container">
        <form:form modelAttribute="admin" action="/JdbcTemplate_war_exploded/insertAdmin" method="post">
            <h4>Add Admin</h4>
            <div>
                Id:
                <form:input path="id"/>
                <form:errors path="id" cssClass="error"/>
            </div>
            <div>
                Admin Name:
                <form:input path="name"/>
            </div>
            <div>
                Password:
                <form:input path="password"/>
            </div>
            <div>
                Admin Email:
                <form:input path="email"/>
            </div>
            <div>
                Phone:
                <form:input path="phone"/>
            </div>
            <input type="submit" value="SAVE">
        </form:form>
    </div>
</div>
</body>
</html>
