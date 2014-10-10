<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet"
	href='${pageContext.request.contextPath}/resources/styles/index.css' />
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript"
	src='${pageContext.request.contextPath}/resources/scripts/script.js'></script>

<title>SYSFER-PRODUCTOS</title>
</head>
<body>
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
	
	<h1>Productos</h1>
    
    <div class="products">
		<form action="resultProductos" method="post">
			<label> Ingrese productos que filtrar: </label> <input type="text"
				class="submitButton" name="nombre" /> <input type="submit" value="Buscar" />
		</form>

		<div class="productsDisplay">
		<ul>
        <c:forEach var="p" items="${resultProductos}">
        <li>${p.getId_producto()} ${p.getNombre()} ${p.getDescripcion()} ${p.getMarca().getNombre()} ${p.getPrecio()} ${p.getStock()}</li>
        </c:forEach>
        </ul>	
    
		</div>
	</div>
	</section>


</body>
</html>