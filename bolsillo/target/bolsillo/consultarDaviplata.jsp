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
<body>
    
    <header class="header">
        <div class="logo">
            <a href= "bolsillo?accion=index"><img src="img/logo.png" alt="Logo marca"></a>
        </div>
        <h1 class="titulo">CONSULTA EN DAVIPLATA</h1>
        <a href="#" class="btn"><button>Contacto</button></a>
    </header>
    <nav class="nav">
        <ul class="nav-links">
            <li><a href= "bolsillo?accion=volverDaviplata">Volver</a></li>
        </ul>
    </nav>

    <section class="nequi-consultar">
        <center><img src="img/daviplata-logo.png" alt="Nequi logo" class="imagen2"></center>
            <form action="bolsillo" method="post">
                <!-- <input class="boton" type="submit" name="accion" value="Consultar Daviplata"> -->
                <button class="boton" type="submit" name="accion" value="Consultar Daviplata">Consultar</button>
            </form>
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