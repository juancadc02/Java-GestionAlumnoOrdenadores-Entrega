<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/bootstrap/cabecera.jsp" %>
<%@ include file="/vistas/cabecera.jsp" %>
<link rel="stylesheet" href="/estilos/paginaPrincipal.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<style>
body{
background-color: #FFFACD;
}
.tablaListaAlumno{


 width: 100%; 
 max-width: 700px; 
 margin: 0 auto; 
 display: flex; 
 flex-direction: column;
 justify-content:center; 
 align-items: center;
     
}
</style>
<title>Baja Alumno</title>
</head>
<body>

				<!-- Barra de navegacion -->

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Baja Alumno</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" 
          data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" 
          aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    
    				<!--  Volver a Inicio -->
      <li class="nav-item active">
        <a onclick="window.location.href='paginaInicio';return false;" class="nav-link" href="#">Volver a Inicio </a>
      </li>
    </ul>
  </div>
</nav>


						<!-- Muestro el listado de alumnos -->
						
						
	<div class="container my-3">
		<div class="col mx-auto bg-light p10">
			<h1 class="text-center mb-4">Listado De Alumnos </h1>
			<form method="post">

				<table class="tablaListaAlumno">
					<tr>

						<th>Id Alumno</th>

						<th>&nbsp;&nbsp;Nombre Alumno</th>
						
						<th>&nbsp;&nbsp;Telefono Alumno</th>

					</tr>

					<c:forEach var="listaAlum" items="${listaDeAlumno}">

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
	
					<!-- Formulario baja alumno  -->
  <div class="container my-4" >
  <div class="col mx-auto bg-light p10">
    <h1 class="text-center mb-4">Baja de Alumno</h1>
    <form action="bajaAlumno" method="post">
     <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <select class="form-control" name="numeroAlumno" id="mySelect">
                    	<c:forEach var="id" items="${listaDeAlumno}">
                    		<option>${id.numeroAlumno}</option>
                    	</c:forEach>                   	
                    </select>
                </div>
            </div>
      <button  type="submit"   class="btn btn-primary mx-auto d-block" onclick="return confirm('¿Estás seguro de que quieres eliminar este usuario?')">Dar De Baja Alumno</button>
    </form>
    </div>
  </div>
						
</body>
</html>