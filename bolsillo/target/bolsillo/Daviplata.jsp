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
            <a href= "bolsillo?accion=index""><img src="img/logo.png" alt="Logo marca"></a>
        </div>
        <h1 class="titulo">BIENVENIDO A DAVIPLATA</h1>
        <a href="#" class="btn"><button>Contacto</button></a>
    </header>

    <section class="formularios">
    <section class="ingresar">
        <center><h1 class="titulo">INICIAR SESIÓN</h1></center>
    <form action="bolsillo" method="post">
        <input class="formulario" type="text" name="cedula" placeholder="Ingrese su cedula">
        <input class="formulario" type="password" name="contra"placeholder="Ingrese su contraseña">
        <br>
        <!-- <center><a class="entrar" href= "bolsillo?accion=ingresarDaviplata"> Ingresar </a></center> -->
        <button class="boton" type="submit" name="accion" value="Ingresar Daviplata">Ingresar</button>
    </form>
    </section>
    </section>
    
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