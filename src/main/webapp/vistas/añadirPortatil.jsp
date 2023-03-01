
<!DOCTYPE html>
<html>
<head>
<%@ include file="/bootstrap/cabecera.jsp" %>
<link rel="stylesheet" href="/estilos/paginaPrincipal.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<style>
body{
background-color: #FFFACD;
}
</style>
<title>Registrar Portatil</title>
</head>
<body>

				<!-- Barra de navegacion -->

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Registro Portatil</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" 
          data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" 
          aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    
    				<!--  Ir a registro de alumnos -->
      <li class="nav-item active">
        <a onclick="window.location.href='paginaInicio';return false;" class="nav-link" href="#">Inicio </a>
      </li>
    </ul>
  </div>
</nav>
		<!-- Formulario de registro  -->
  <div class="container my-4" >
  <div class="col mx-auto bg-light p10">
    <h1 class="text-center mb-4">Registro de Portatil</h1>
	    <form action="añadirPortatil" method="post">
	       <div class="mb-3">
	        <label for="marca_ordenador" class="form-label">Marca Ordenador</label>
	        <input type="text" class="form-control" id="marca_ordenador" name="marcaPortatil" required>
	      </div>
	       <div class="mb-3">
	        <label for="modelo_ordenador" class="form-label">Modelo Ordenador</label>
	        <input type="text" class="form-control" id="modelo_ordenador" name="modeloPortatil" required>
	      </div>
	      
	      <button  type="submit" class="btn btn-primary mx-auto d-block">Registrar Portatil</button>
	    </form>
    </div>
  </div>

</body>
</html>