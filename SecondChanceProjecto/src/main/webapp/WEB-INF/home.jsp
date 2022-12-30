<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Home.css">
    <script src="https://kit.fontawesome.com/8c2ce3db19.js" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>Second Chance</title>
</head>

<body>
    <header>
        <img id=logo src="imagenes/Second_Chance.jpg" alt="Logo de Second Chance">
        <button class="btn">Registrate</button>
        <button class="btn">Inicia sesion</button>

            <!--Carrusel-->
            <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="imagenes/GettyImages-977898246-1942d4364fa64bd2ba792a86f4f24715.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="imagenes/e0b61-akita-americano-todo-lo-que-necesitas-saber-1-.jpg" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="imagenes/image_7867e-Cats.jpg" alt="Third slide">
                    </div>
                    </div>
                        <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                    <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
    </header>


    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-item nav-link active" href="#">¿Quienes Somos?</a>
                <a class="nav-item nav-link active" href="#">Misiones y Vision</a>
                <a class="nav-item nav-link active" href="#">Adóptame Aquí</a>
                <a class="nav-item nav-link active" href="#">Como Apoyarnos</a>
                <a class="nav-item nav-link active" href="#">Asociaciones</a>
                <a class="nav-item nav-link active" href="#">Historia de Adoptados</a>
            </div>
        </div>
    </nav>

            <div class="contenedor publicaciones">
                <div class="contieneForeach">
                        <div class="publicacion">
                            <div class="foto">
                                <img class="foto" src="https://www.publimetro.cl/resizer/5kck4-Julb9l4t70SgTp_aE2Yyk=/800x0/filters:format(jpg):quality(70)/cloudfront-us-east-1.images.arcpublishing.com/metroworldnews/QR6PIGQRZJGIREAHFESUPMKA64.jpg" alt="perrito">
                            </div>
                            <div>
                                <button class="cuadrado"><i class="fa-solid fa-beat"><img src="imagenes/Imagen1.png" alt=""></i></button>
                            </div>
                            <div class="descripcion">
                                    <h6>Nombre</h6>
                                    <h6>Genero</h6>
                                    <h6>Nivel energia</h6>
                            </div>
                        </div>
                        <div class="publicacion">
                            <div class="foto">
                                <img class="foto" src="imagenes/image.jpg" alt="dog2">
                            </div>
                            <div>
                                <button class="cuadrado"><i class="fa-solid fa-beat"><img src="imagenes/Imagen1.png" alt=""></i></button>
                            </div>
                            <div class="descripcion">
                                    <h6>Nombre</h6>
                                    <h6>Genero</h6>
                                    <h6>Nivel energia</h6>
                            </div>
                        </div>
                        <div class="publicacion">
                            <div class="foto">
                                <img class="foto" src="imagenes/image.jpg" alt="dog2">
                            </div>
                            <div>
                                <button class="cuadrado"><i class="fa-solid fa-beat"><img src="imagenes/Imagen1.png" alt=""></i></button>
                            </div>
                            <div class="descripcion">
                                    <h6>Nombre</h6>
                                    <h6>Genero</h6>
                                    <h6>Nivel energia</h6>
                            </div>
                        </div>
                        <div class="publicacion">
                            <div class="foto">
                                <img class="foto" src="imagenes/image.jpg" alt="dog2">
                            </div>
                            <div>
                                <button class="cuadrado"><i class="fa-solid fa-beat"><img src="imagenes/Imagen1.png" alt=""></i></button>
                            </div>
                            <div class="descripcion">
                                    <h6>Nombre</h6>
                                    <h6>Genero</h6>
                                    <h6>Nivel energia</h6>
                            </div>
                        </div>
                </div>
                    <!-- </c:forEach> -->
                </div>
            </div>

            <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>