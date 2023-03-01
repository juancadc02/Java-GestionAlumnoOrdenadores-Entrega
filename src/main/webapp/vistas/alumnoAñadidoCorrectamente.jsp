
<!DOCTYPE html>
<html>
<head>
<%@ include file="/vistas/cabecera.jsp" %>
<%@ include file="/bootstrap/cabecera.jsp" %>
<link rel="stylesheet" href="/estilos/paginaPrincipal.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<style type="text/css">

.tablaMuestraAlumno{


 width: 100%; 
 max-width: 600px; 
 margin: 0 auto; 
 display: flex; 
 flex-direction: column;
 justify-content:center; 
 align-items: center;
     
}
body {
	background-color: #FFFACD;
}
</style>
<title>Insert title here</title>
</head>
<body>

				<!-- Barra de navegacion -->
				<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Datos Alumno Registrado</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" 
          data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" 
          aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a onclick="window.location.href='paginaInicio';return false;" class="nav-link" href="#">Inicio</a>
      </li>
      <li class="nav-item">
        <a onclick="window.location.href='añadirNuevoAlumno';return false;" class="nav-link" href="#">Volver a Registros</a>
      </li>
      </ul>
      </div>
</nav>
      
    			  <!-- Muestro al alumno registrado  -->
      
   
   <div class="container my-4" >
  <div class="col mx-auto bg-light p10">
    <h1 class="text-center mb-4">Datos Alumno Registrado</h1>
    <form method="post">
     
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
    			<c:forEach var="portatil" items="${miModelo.listaPortatil}" varStatus="innerLoop">
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
    </form>
    </div>
  </div>
  
</body>
</html>