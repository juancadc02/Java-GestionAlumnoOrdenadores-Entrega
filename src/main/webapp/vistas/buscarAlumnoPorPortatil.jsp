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
<title>Buscar Alumno Por Portatil</title>
</head>
<body>

				<!-- Barra de navegacion -->

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Buscar Alumno Por Portatil</a>
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
			<h1 class="text-center mb-4">Listado De Portatiles</h1>
			<form method="post">

				<table class="tablaListaAlumno">
					<tr>

						<th>Id Portatil</th>

						<th>&nbsp;&nbsp;Marca Portatil</th>
						
						<th>&nbsp;&nbsp;Modelo Portatil</th>

					</tr>

					<c:forEach var="listaPort" items="${listaPortatiles}">

					<tr>
						<td>${listaPort.identificadorPortatil}</td>
						<td>&nbsp;&nbsp;${listaPort.marcaPortatil}</td>
						<td>&nbsp;&nbsp;${listaPort.modeloPortatil}</td>
					</tr>
					</c:forEach>


				</table>

			</form>
		</div>
	</div>
	
		<!-- Formulario de buscar ordenador de alumno  -->
<div class="container my-4" >
  <div class="col mx-auto bg-light p10">
    <h1 class="text-center mb-4">Introduce el id del Portatil</h1>
    <form action="buscarAlumnoPorPortatil" method="post">
     <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <select class="form-control" name="numeroIdentificador" id="mySelect">
                    	<c:forEach var="id" items="${listaPortatiles}">
                    		<option>${id.identificadorPortatil}</option>
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











