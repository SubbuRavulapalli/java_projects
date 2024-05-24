<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delivery Address</h1>
<%--@elvariable id="address" type=""--%>
<form:form modelAttribute="address" action="/JdbcTemplate_war_exploded/addToPayment" method="post">
    <table>
        <tr>
            <td> House No :</td>
            <td> <form:input path="houseNo"/><br><br>
        </tr>
        <tr>
            <td>Street Name :</td>
            <td><form:input path="street"/><br><br>
        </tr>
        <tr>
            <td>Village Name:</td>
            <td> <form:input path="village"/><br><br>
        </tr>
        <tr>
            <td>City Name:</td>
            <td><form:input path="city"/><br><br>
        </tr>
        <tr>
            <td>Pincod  :</td>
            <td><form:input path="pincode"/></td>
        </tr>
        <tr> <td>
            <button type="submit">Order</button>
        </td></tr>
    </table>
</form:form>
</body>
</html>
