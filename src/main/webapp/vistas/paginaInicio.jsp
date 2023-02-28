<html>

<head>
<%@ include file="/bootstrap/cabecera.jsp" %>
<link rel="stylesheet" href="/estilos/paginaPrincipal.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
body{
background-color: #FFFACD;
}
</style>
<title>Pagina de inicio</title>
</head>
<body>

						<!-- Barra de navegacion -->

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Pagina Principal</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" 
          data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" 
          aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    
    				<!--  Ir a registro de alumnos -->
      <li class="nav-item active">
        <a onclick="window.location.href='añadirNuevoAlumno';return false;" class="nav-link" href="#">Alta Alumno </a>
      </li>
       <li class="nav-item active">
        <a onclick="window.location.href='añadirNuevoPortatil';return false;" class="nav-link" href="#">Alta Portatil </a>
      </li>
      <li class="nav-item active">
        <a onclick="window.location.href='darDeBajaAlumno';return false;" class="nav-link" href="#">Baja Alumno </a>
      </li>
      <li class="nav-item active">
        <a onclick="window.location.href='buscarPortatilPorAlumno';return false;" class="nav-link" href="#">Buscar Portatil Por Alumno</a>
      </li>
       <li class="nav-item active">
        <a onclick="window.location.href='buscarAlumnoPorPortatil';return false;" class="nav-link" href="#">Buscar Alumno Por Portatil</a>
      </li>
       <li class="nav-item active">
        <a onclick="window.location.href='cargarListadoCompleto';return false;" class="nav-link" href="#">Listado Completo</a>
      </li>
      
      
    </ul>
    
  </div>
</nav>
		
  
</body>


</html>