<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Payment Page</h1>
<%--@elvariable id="payment" type=""--%>
<form:form modelAttribute="payment" action="/JdbcTemplate_war_exploded/order" method="post">
    <table>
        <tr>
            <td> cardType :</td>
            <td> <form:input path="cardType"/><br><br>
        </tr>
        <tr>
            <td>CardHolder name :</td>
            <td><form:input path="name"/><br><br>
        </tr>
        <tr>
            <td>Card Number:</td>
            <td> <form:input path="cardNo"/><br><br>
        </tr>
        <tr>
            <td>Card cvv :</td>
            <td><form:input path="cvv"/><br><br>
        </tr>
        <tr> <td>
            <button type="submit">Order</button>
        </td></tr>
    </table>
</form:form>
</body>
</html>
