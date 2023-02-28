<!DOCTYPE html>
<html>
<head>
<%@ include file="/bootstrap/cabecera.jsp"%>
<%@ include file="/vistas/cabecera.jsp"%>
<style>
.tablaOrdenadorAlumno {
	width: 100%;
	max-width: 600px;
	margin: 0 auto;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

body {
	background-color: #FFFACD;
}
</style>
<title>Listado Completo</title>
</head>
<body>
<body>

					<!-- Barra de navegacion -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Listado Completo</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a
					onclick="window.location.href='paginaInicio';return false;"
					class="nav-link" href="#">Inicio</a></li>
			</ul>
		</div>
	</nav>


					<!-- Muestro todos los datos-->


	  <table class="table table-striped">
  		<thead>
    		<tr>
      			<th scope="col"></th>
      			<th scope="col">ID Alumno</th>
      			<th scope="col">Nombre</th>
      			<th scope="col">Teléfono</th>
      			<th scope="col">Numero Identificador</th>
      			<th scope="col">Marca Portatil</th>
      			<th scope="col">Modelo Portatil</th>
    		</tr>
  		</thead>
  		<tbody> 			
  			<c:forEach var="alumno" items="${miModelo.listaAlumno}" varStatus="loop">
  				<tr>
    				<th scope="row">${loop.index+1}</th>
    				<td>${alumno.numeroAlumno}</td>
    				<td>${alumno.nombreAlumno}</td>
    				<td>${alumno.telefonoAlumno}</td>
    			<c:forEach var="portatil" items="${miModelo.listaPortatiles}" varStatus="innerLoop">
      				<c:if test="${innerLoop.index == loop.index}">
        				<td>${portatil.identificadorPortatil}</td>
        				<td>${portatil.marcaPortatil}</td>
        				<td>${portatil.modeloPortatil}</td>
      				</c:if>
    			</c:forEach>
  				</tr>
			</c:forEach>		
  		</tbody>	
	</table>
    

</body>
</html>