<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <!-- Bootstrap -->
    <title>Home SecondChance</title>
</head>
<body>
    <nav class="navbar bg-light">
        <div class="container-fluid">
            <a class="navbar-brand fw-bold">SecondChance</a>
            <a href="/login">Ingresar</a>
            <a href="/registro">Registrarse</a>
        </div>
    </nav>

            <div class="contenedor publicaciones">
                <div class="contieneForeach">
                    <%-- <c:forEach var="" items="${}"> --%>
                        <div class="publicacion">
                            <div class="foto">
                                <img src="https://www.publimetro.cl/resizer/5kck4-Julb9l4t70SgTp_aE2Yyk=/800x0/filters:format(jpg):quality(70)/cloudfront-us-east-1.images.arcpublishing.com/metroworldnews/QR6PIGQRZJGIREAHFESUPMKA64.jpg" alt="perrito">
                            </div>
                            <div class="descripcion">
                                <h6>Nombre</h6>
                                <h6>Genero</h6>
                                <h6>Nivel energia</h6>
                            </div>
                        </div>
                    <%-- </c:forEach> --%>
                </div>
            </div>
                
            
</body>
</html>