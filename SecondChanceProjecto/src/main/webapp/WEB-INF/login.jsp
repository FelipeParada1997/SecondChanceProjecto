<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <p><c:out value="${logError}"/>Error en inicio de sesion,por favor reintente</p>
    <form method="post" action="/loginpost">
        <p>
            <label class="form-label" for="email">Email</label>
            <input  class="form-control" type="text" id="email" name="email"/>
        </p>
        <p>
            <label class="form-label" for="password">Password</label>
            <input  class="form-control" type="password" id="password" name="password"/>
        </p>
        <input type="submit" value="Login!"/>
    </form>
</body>
</html>