<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pagina de Registro e inicio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
                        rel="stylesheet"
                        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
                        crossorigin="anonymous">
                        <link rel="stylesheet" href="/css/registro.css">
</head>
<body>
    <div class="container">
    <h1>Register!</h1>



    <form:form method="POST" action="registerpost" modelAttribute="user">

        <p>
            <form:label class="form-label" path="nombre">Nombre:</form:label>
            <form:errors path="nombre"/>
            <form:input  class="form-control" type="text" path="nombre"/>
        </p>
        <p>
            <form:label class="form-label" path="email">Email:</form:label>
            <form:errors path="email"/>
            <form:input  class="form-control" type="email" path="email"/>
        </p>
        <p>
            <form:label class="form-label" path="password">Password:</form:label>
            <form:password class="form-control" path="password"/>
        </p>
        <p>
            <form:label class="form-label" path="passwordConfirm">Password Confirmation:</form:label>
            <form:password class="form-control"  path="passwordConfirm"/>
        </p>
        <input type="submit" value="Register!"/>
    </form:form>





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
</div>
</body>
</html>