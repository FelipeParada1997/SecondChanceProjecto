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
        <!---- bootstrap ----->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <!-- Css -->
<link rel="stylesheet" href="login.css">
    <title>Login</title>
</head>
<body>

    <div class="login-container">
        <div class="login-info-container">
            <h1 class="tittle">Inicia con</h1>
            <div class="social-login">
            <div class="social-login-element">
                <img src="https://raw.githubusercontent.com/ederivc/LoginForm-HTML-CSS/9532600615c67763640acb948675adf3a726e00f/images/facebook.svg" alt="google-image">
                <span>Google</span>
            </div>
            <div class="social-login-element">
                <img src="imagenes/facebook.png" alt="google-image">
                <span>facebook</span>
            </div>
        </div>
        <p>o</p>
        <p><c:out value="${error}"/></p>
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
    <p>¿No tienes una cuenta?<span class="span">Crea una aquí!</span></p>
    </div>
    <img src="imagenes/login.png" alt="login">
</div>
    
</body>
</html>