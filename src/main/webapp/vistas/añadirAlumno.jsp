
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
</style>
<script>
window.onload = function() {
    var mySelect = document.getElementById("mySelect");
    
    if (mySelect.value === "No hay portatiles libres") {


    }
};
</script>
<title>Registrar Alumno</title>
</head>
<body>

				<!-- Barra de navegacion -->

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Registro Alumno</a>
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
    <h1 class="text-center mb-4">Registro de Alumno</h1>
    <form action="añadirAlumno" method="post">
      <div class="mb-3">
        <label for="nombre" class="form-label">Nombre completo</label>
        <input type="text" class="form-control" id="nombre" name="nombreAlumno" required>
      </div>
      <div class="mb-3">
        <label for="telefono" class="form-label">Teléfono</label>
        <input type="tel" class="form-control" id="telefono" name="telefonoAlumno" required>
      </div>
      <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Portatil (Seleccione un ID)</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <select class="form-control" name="identificadorPortatil" id="mySelect">
                    	<c:forEach var="id" items="${listIDsPortailesLibres}">
                    		<option>${id}</option>
                    	</c:forEach>                   	
                    </select>
                </div>
            </div>
      
      <button  type="submit" class="btn btn-primary mx-auto d-block">Registrar</button>
    </form>
    </div>
  </div>
  







<!-- <table class="tablaTitle">
<tr>
<td><h1>Añadir Alumno</h1></td>
</tr>

</table>
<br/><br/>
<form action="añadirAlumno" method="post">

<table class="tablaRegistro" border="0">


<tr>
<th> <label for="nombre">Nombre:</label></th>
<td><input type="text" name="nombreAlumno" id="nombre"></td>
</tr>


<tr>
<th> <label for="apellidos">Telefono:</label></th>
<td><input type="text" name="telefonoAlumno" id="apellidos"></td>
</tr>


<tr>
<th> <label for="dni">Marca Portatil:</label></th>
<td><input type="text" name="marcaPortatil" id="dni"></td>
</tr>

<tr>
<th> <label for="dni">Modelo Portatil:</label></th>
<td><input type="text" name="modeloPortatil" id="dni"></td>
</tr>


<tr>
<td colspan="3" align="center"><br/><br/><input type="submit" name="button" id="button" value="Aadir Cliente"></td>
<td  colspan="5" align="center"><br/><br/><input type="button" value="Volver a Inicio" onclick="window.location.href='paginaInicio';return false;"/></td>
</tr>

</table>
</form>
 -->

</body>
</html>