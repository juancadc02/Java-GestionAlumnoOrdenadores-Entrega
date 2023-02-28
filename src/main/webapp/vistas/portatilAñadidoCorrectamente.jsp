<!DOCTYPE html>
<html>
<head>
<%@ include file="/vistas/cabecera.jsp"%>
<%@ include file="/bootstrap/cabecera.jsp"%>
<link rel="stylesheet" href="/estilos/paginaPrincipal.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
.tablaMuestraPortatiles {
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
<title>Insert title here</title>
</head>
<body>

	<!-- Barra de navegacion -->


	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Datos Alumno Registrado</a>
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
				<li class="nav-item"><a
					onclick="window.location.href='añadirNuevoPortatil';return false;"
					class="nav-link" href="#">Volver a alta Portatil</a></li>
			</ul>
		</div>
	</nav>

	<!-- Muestro al portatil registrado  -->


	<div class="container my-4">
		<div class="col mx-auto bg-light p10">
			<h1 class="text-center mb-4">Datos Portatil Registrado</h1>
			<form method="post">

				<table class="tablaMuestraPortatiles">
					<tr>

						<th>Marca Portatil</th>

						<th>&nbsp;&nbsp;Modelo Portatil</th>

					</tr>

					<c:forEach var="ordenadorNuevo" items="${lista}">

						<tr>
							<td>${ordenadorNuevo.marcaPortatil}</td>
							<td>&nbsp;&nbsp;${ordenadorNuevo.modeloPortatil}</td>
						</tr>

					</c:forEach>



				</table>

			</form>
		</div>
	</div>

</body>
</html>