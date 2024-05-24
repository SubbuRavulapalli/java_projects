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
        .error{
            color: brown;
            font-size: 10px;
        }
        form {
            width: 350px;
            margin: 0 auto;
        }
        form input{
            width: 100%;
            padding: 0px;
            margin-bottom: 2px;
        }
        body{
            background-image: url("https://img.freepik.com/premium-photo/toy-shopping-cart-with-boxes-credit-card-with-copy-space_339191-197.jpg");
            background-position: center;
            background-size: cover;
        }
    </style>
</head>
<body>
    <%--@elvariable id="employee" type=""--%>
    <form:form modelAttribute="employee" action="/JdbcTemplate_war_exploded/addEmployee" method="post" cssClass="error">
        <center><h4>Add Employee</h4></center>
        Id :<br>
        <form:input path="id"/>
        <br>
        <form:errors path="id" cssStyle="color: red"/>
        <br>
        Employee Name :<br>
        <form:input path="name"/><br>
        <form:errors path="name" cssStyle="color:red"/>
        <br>
        Employee age :<br>
        <form:input path="age"/><br>
        <form:errors path="age" cssStyle="color:red"/>
        <br>
        Employee Email :<br>
        <form:input path="email"/><br>
        <form:errors path="email" cssStyle="color:red"/>
        <br>
        Employee Password:<br>
        <form:input path="password"/><br>
        <form:errors path="password" cssStyle="color:red"/>
        <br>
        PINCODE :<br>
        <form:input path="pincode"/><br>
        <form:errors path="pincode" cssStyle="color:red"/>
        <br>
        Employee Adhar :<br>
        <form:input path="adhar"/><br>
        <form:errors path="adhar" cssStyle="color:red"/>
        <br>
       Employee Pan :<br>
        <form:input path="pan"/><br>
        <form:errors path="pan" cssStyle="color:red"/>
        <br>
        Employee phone:<br>
        <form:input path="phone"/><br>
        <form:errors path="phone" cssStyle="color:red"/>
        <br>
        <input type="submit" name="SAVE">
    </form:form>

</body>
</html>
