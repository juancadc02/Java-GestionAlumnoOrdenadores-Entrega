<!DOCTYPE html>
<html>
<head>
<%@ include file="/bootstrap/cabecera.jsp" %>
<%@ include file="/vistas/cabecera.jsp" %>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<style>
body{
background-color: #FFFACD;
}
.tablaListaAlumno{


 width: 100%; 
 max-width: 600px; 
 margin: 0 auto; 
 display: flex; 
 flex-direction: column;
 justify-content:center; 
 align-items: center;
     
}
</style>
<title>Buscar Portatil Por Alumno</title>
</head>
<body>

				<!-- Barra de navegacion -->

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Buscar Portatil Por Alumno</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" 
          data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" 
          aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    
    				<!--  Ir a Inicio -->
      <li class="nav-item active">
        <a onclick="window.location.href='paginaInicio';return false;" class="nav-link" href="#">Inicio </a>
      </li>
    </ul>
  </div>
</nav>

				<!-- Muestro el listado de los alumno -->
				<div class="container my-3">
		<div class="col mx-auto bg-light p10">
			<h1 class="text-center mb-4">Listado De Alumno</h1>
			<form method="post">

				<table class="tablaListaAlumno">
					<tr>

						<th>Id Alumno</th>

						<th>&nbsp;&nbsp;Nombre Alumno</th>
						
						<th>&nbsp;&nbsp;Telefono Alumno</th>

					</tr>

					<c:forEach var="listaAlum" items="${lista}">

					<tr>
						<td>${listaAlum.numeroAlumno}</td>
						<td>&nbsp;&nbsp;${listaAlum.nombreAlumno}</td>
						<td>&nbsp;&nbsp;${listaAlum.telefonoAlumno}</td>
					</tr>
					</c:forEach>


				</table>

			</form>
		</div>
	</div>
	
		<!-- Formulario de buscar ordenador de alumno  -->
<div class="container my-4" >
  <div class="col mx-auto bg-light p10">
    <h1 class="text-center mb-4">Introduce el ID del Alumno</h1>
    <form action="buscarPortatilPorAlumno" method="post">
     <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <select class="form-control" name="numeroAlumno" id="mySelect">
                    	<c:forEach var="id" items="${lista}">
                    		<option>${id.numeroAlumno}</option>
                    	</c:forEach>                   	
                    </select>
                </div>
            </div>
      <button  type="submit"   class="btn btn-primary mx-auto d-block">Buscar</button>
    </form>
    </div>
  </div>
  
</body>
</html>











