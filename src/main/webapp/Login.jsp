<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="css/estilos.css" type="text/css" rel="stylesheet">
	
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
	
	<title>Ventana del Usuario</title>
</head>
<body>
	<h2>INGRESAR AL SISTEMA</h2>
	<form action="ServletUsuario" method="post">
		<table>
			<tr>
				<td>Usuario</td>
				<td><input name="usuario" type="text" placeholder="Ingresar usuario"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input name="password" type="password" placeholder="Ingresar contraseña"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input class="btn_ini" type="submit" value="Ingresar">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
