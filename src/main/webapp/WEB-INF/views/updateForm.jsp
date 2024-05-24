<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        form{
            background-color: darkturquoise;
            height: 400px;
            width: 30%;
            /*align-content: center;*/
        }
        /*input{*/
        /*    height: 20px;*/
        /*}*/
        body{
            background-image: url("https://img.freepik.com/premium-photo/toy-shopping-cart-with-boxes-credit-card-with-copy-space_339191-197.jpg");
            background-position: center;
            background-size: cover;
        }
    </style>
</head>
<body>


<center>
    <h1>Update The Product Details..!!</h1><br>
    <%--@elvariable id="data" type=""--%>
    <form:form modelAttribute="data" action="/JdbcTemplate_war_exploded/updateProduct" method="post">
        <br><br>
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
                <td><form:input path="price"/></td>
            </tr>
            <tr>
                <td>description :</td>
                <td><form:input path="description"/></td>
            </tr>
            <tr> <input type="submit" name="SAVE"></tr>
        </table>

    </form:form>
</center>
</body>
</html>
