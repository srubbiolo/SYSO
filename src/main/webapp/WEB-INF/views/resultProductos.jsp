<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!--Style Sheets-->
<link type="text/css" rel="stylesheet" href='${pageContext.request.contextPath}/resources/styles/index.css' />
<link type="text/css" rel="stylesheet" href='${pageContext.request.contextPath}/resources/styles/tablas.css' />

<!--Scripts-->
<script src='${pageContext.request.contextPath}/resources/scripts/jquery-1.9.1.min.js'></script> 

<title>SYSFER-PRODUCTOS</title>
</head>
<body>

	<div class="backgroundImage" > <!--This is the background image--> </div>
	
	<section class="container">
	<div class="header">
		<a href="/ferreteria/index.html">
			<img id="logo" alt="" url="/index"
				src='${pageContext.request.contextPath}/resources/images/logoFerreteria.png'>
		</a>
		<ul class="buttons">
			<li><a href="/ferreteria/index.html" class="home">Home</a></li>
			<li><a href="/ferreteria/resultProductos.html" class="productos">Productos</a></li>
		</ul>
	</div>
	<div class="mainContent" >
		<h1>Productos</h1>
		<form action="resultProductos" method="post">
			<label> Ingrese productos que filtrar: </label> <input type="text"
				class="submitButton" name="nombre" /> <input type="submit" value="Buscar" />
		</form>
		<label>Resultado de la busqueda para : ${nombre}</label>
	    <table cellspacing='0'>
			<div class="productsDisplay">
			<!-- START Table Header -->
			<thead>
				<tr>
					<th>Id de producto</th>
					<th>Nombre</th>
					<th>Descripción</th>
					<th>Marca</th>
					<th>Precio</th>
					<th>Cantidad disponible</th>
					<th>Cantidad</th>
					<th>Comprar</th>
				</tr>
			</thead>
			<!-- END Table Header -->
		
			<!-- START Table Body -->
			<tbody>
			<c:forEach var="p" items="${resultProductos}">
				<tr>
					<td>${p.getId_producto()}</td>
					<td>${p.getNombre()}</td>
					<td>${p.getDescripcion()}</td>
					<td>${p.getMarca().getNombre()}</td>
					<td>${p.getPrecio()}</td>
					<td>${p.getStock()}</td>
					
					<form action="resultProductos" method="post">
						<input type="hidden" name="id_producto" value="${p.getId_producto()}"/>
						<!--  <input type="hidden" name="nombre" value="${p.getNombre()}"/>
						<input type="hidden" name="desc" value="${p.getDescripcion()}"/>
						<input type="hidden" name="marca" value="${p.getMarca().getNombre()}"/>
						<input type="hidden" name="precio" value="${p.getPrecio()}"/>
						<input type="hidden" name="stock" value="${p.getStock()}"/>-->
						<td> <input type="text" class="submitButton" name="cantidad" /> </td>
						<td> <input type="submit" value="Comprar este producto" /> </td>			
					</form>
				</tr>
				 </c:forEach>
			</tbody>
			<!-- END Table Body -->
			</table>

		</div>
	</section>


</body>
</html>