<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Error Page</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <!-- Custom CSS -->
  <style>
    /* Center the content vertically and horizontally */
    body {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      background-color: #f5f5f5;
    }
    /* Custom error message */
    .error-message {
      font-size: 4rem;
      font-weight: bold;
      color: #333;
    }
  </style>
</head>
<body>
  <div class="container text-center">
    <h1 class="error-message">Oops!</h1>
    <p>Se ha producido un error inesperado.</p>
    <a onclick="window.location.href='paginaInicio';return false;" href="#" class="btn btn-primary">Volver a inicio</a>
  </div>
  <!-- jQuery and Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
