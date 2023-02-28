<!DOCTYPE html>
<html>
<head>
<%@ include file="/bootstrap/cabecera.jsp" %>
<%@ include file="/vistas/cabecera.jsp" %>
<style>
.tablaOrdenadorAlumno{


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
<title>Buscar Portatil Por Alumno</title>
</head>
<body>
 <body>

<!-- Barra de navegacion -->
				<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Datos Portatil Alumno</a>
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
        <a onclick="window.location.href='buscarPortatilPorAlumno';return false;" class="nav-link" href="#">Volver a Buscar Ordenador</a>
      </li>
      </ul>
      </div>
</nav>
    
    
    	  <!-- Muestro el ordenador del alumno  -->
      
   
   <div class="container my-4" >
  <div class="col mx-auto bg-light p10">
    <h1 class="text-center mb-4">Datos Portatil Alumno</h1>
    <form method="post">

<table class="tablaOrdenadorAlumno">

<tr>


<th>Marca Portatil</th>


<th>&nbsp;&nbsp;Modelo Portatil</th>



</tr>


<c:forEach var="ordenadorAlumno" items="${portatil}">

			<tr>
				<td>${ordenadorAlumno.marcaPortatil}</td>
				<td>${ordenadorAlumno.modeloPortatil}</td>
			</tr>


</c:forEach>


</table>

    </form>
    </div>
  </div>

</body>
</html>