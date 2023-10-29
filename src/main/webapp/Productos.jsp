<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="model.TblProductocl2" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="css/estilos.css" type="text/css" rel="stylesheet">
	
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
	
	<title>Registrar producto</title>
</head>
<body>
	<h1>Registrar Producto</h1>
	<form action="ServletProducto" method="post">
		<table>
			<tr>
				<td>Nombre</td>
				<td><input name="nombre" type="text" placeholder="Ingresar nombre del producto"></td>
			</tr>
			<tr>
				<td>Precio de venta</td>
				<td><input name="pv" type="text" placeholder="Ingresar el precio de venta"></td>
			</tr>
			<tr>
				<td>Precio de compra</td>
				<td><input name="pc" type="text" placeholder="Ingresar el precio de compra"></td>
			</tr>
			<tr>
				<td>Estado</td>
				<td>
					<select name="estado">
						<option>Vigente</option>
						<option>Vencido</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Descripcion</td>
				<td><input name="desc" type="text" placeholder="Ingresar descripcion del producto"></td>
			</tr>
			<tr>
				<td colspan="3">
					<input name="RegistraProducto" type="submit" value="Registrar">
				</td>
			</tr>
		</table>
	</form>
	
	<h1>Listado de productos</h1>
	<table class="crud">
		<tr>
		<th>Codigo</th>
		<th>Nombre</th>
		<th>Precio.V</th>
		<th>Precio.C</th>
		<th>Estado</th>
		<th>Descripción</th>
		
		<%List<TblProductocl2> Listadoproducto = (List<TblProductocl2>)request.getAttribute("listado");
		if(Listadoproducto!=null){
			for(TblProductocl2 lis:Listadoproducto){%>	
			<tr>
				<td><%=lis.getIdproductocl2() %></td>
				<td><%=lis.getNombrecl2() %></td>
				<td><%=lis.getPrecioventacl2() %></td>
				<td><%=lis.getPreciocompracl2() %></td>
				<td><%=lis.getEstadocl2() %></td>
				<td><%=lis.getDescripcl2() %></td>
			</tr>
		<%	}
		}%>
	</table>
	
</body>
</html>