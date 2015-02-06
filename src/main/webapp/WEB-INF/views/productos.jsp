<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!--Style Sheets-->
<link type="text/css" rel="stylesheet" href='${pageContext.request.contextPath}/resources/styles/index.css' />
<link type="text/css" rel="stylesheet" href='${pageContext.request.contextPath}/resources/styles/tablas.css' />

<!--Scripts-->
<script src='${pageContext.request.contextPath}/resources/scripts/jquery-1.9.1.min.js'></script> 

<title>LISTA-PRODUCTOS</title>
</head>
<body>

	<div class="backgroundImage" > <!--This is the background image--> </div>
	
	<section class="container">
	<div class="header">
		<a href="/ferreteria/home.html">
			<img id="logo" src='${pageContext.request.contextPath}/resources/images/logoFerreteria.png'>
		</a>
		<div id="user"></div>
		<ul class="buttons">
			<li><a href="/ferreteria/home.html" class="home">Volver</a></li>
		</ul>
	</div>
    <div class="mainContent" >
		<h1>Productos</h1>
	    <table cellspacing='0'>
	
		<!-- START Table Header -->
		<thead>
			<tr>
				<th>Id de producto</th>
				<th>Nombre de producto</th>
				<th>Descripción</th>
				<th>Marca</th>
				<th>Precio</th>
				<th>Cantiad en stock</th>
				
			</tr>
		</thead>
		<!-- END Table Header -->
	
		<!-- START Table Body -->
		<tbody>
		<c:forEach var="p" items="${productos}">
			<tr>
				<td>${p.getId_producto()}</td>
				<td>${p.getNombre()}</td>
				<td>${p.getDescripcion()}</td>
				<td>${p.getMarca().getNombre()}</td>
				<td>${p.getPrecio()}</td>
				<td>${p.getStock()}</td>
			</tr>
			 </c:forEach>
		</tbody>
		<!-- END Table Body -->
	
		</table>
	</div>
	</section>
</body>
</html>