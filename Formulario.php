<?php
session_start();
?>
<html>
<head>
    <meta charset="utf-8">
    <title>Formulario</title>
</head>
<body>
    <form action="sessiones.php" method="post">
        Nombre:<br>
        <input type="text" name="nombre" placeholder="Ingrese Nombre" required><br>
        Apellido:<br>
        <input type="text" name="apellido" placeholder="Ingrese Apellido" required><br>
        Fecha de Nacimiento:<br>
        <input type="date" name="fecha" required>
        <input type="submit" value="Enviar">
    </form>
    <a href="session_fin.php">terminar</a>
    <a href="Formulario.php">inicio</a>

</body>
</html>
