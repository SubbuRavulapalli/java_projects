<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<center>
    <h1>Login Page</h1>
    <c:if test="${error eq 'true'}"> <font color="red">${msg}</font></c:if>
<%--    <h4>${msg}</h4>--%>
    <form action="home" method="post">
        <table>
            <tr>
                <td>
                    <label>UserName :</label>
                </td>
                <td> <input type="text" name="userName" placeholder="Enter UserName :"></td>
            </tr>
            <tr>
                <td><label>Password :</label></td>
                <td><input type="password" name="password" placeholder="Enter Password :"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" name="Login">
                </td>
            </tr>
        </table>

    </form>
</center>

</body>
</html>
