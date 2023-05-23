<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daviplata</title>
    <link rel="stylesheet" href="Estilos.css">
</head>
<header class="header">
    <div class="logo">
        <a href= "bolsillo?accion=index"><img src="img/logo.png" alt="Logo marca"></a>
    </div>
    <h1 class="titulo">RECARGAS DAVIPLATA</h1>
    <a href="#" class="btn"><button>Contacto</button></a>
</header>
<nav class="nav">
    <ul class="nav-links">
        <li><a href= "bolsillo?accion=volverDaviplata">Volver</a></li>
    </ul>
</nav>
<body>

    <section class="daviplata">
        <center><img src="img/daviplata-logo.png" alt="" class="imagen2">
        <br><br>
        <h1 class="titulo">RECARGA EXITOSA</h1>
        <br><br>
        <p class="texto">Valor de recarga: <%=request.getAttribute("recarga")%> </p>
        <p class="texto">Su saldo es: <%=request.getAttribute("saldo")%> </p>
        </center>
    </section>

    <br><br><br>

    <footer class="footer">
        <center>
        <P> 
        <p><b>Correo:</b>brasmoreno5@soy.sena.com</p>
          <br>
        <p><b>Celular:</b> 123456789</p>
          <br>
        <b> Copyright &copy; 2023 - BOGOTÁ</b>
    </center>
    </footer>

</body>
</html>

</body>
</html>