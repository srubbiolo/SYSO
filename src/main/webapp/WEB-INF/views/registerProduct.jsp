<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

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

<title>REGISTRAR-PRODUCTOS</title>
</head>
<body>

	<div class="backgroundImage" > <!--This is the background image--> </div>
	
	<section class="container">
	<div class="header">
		<a href="/ferreteria/home.html">
			<img id="logo" src='${pageContext.request.contextPath}/resources/images/logoFerreteria.png'>
		</a>
		<div id="user">Hola XXXXXX</div>
		<ul class="buttons">
			<li><a href="/ferreteria/home.html" class="home">Volver</a></li>
		</ul>
	</div>
	    <div align="center">
       <form:form action="addProducto" method="post"
			commandName="formProducto">

			<div class="add-producto--form-container">

				<div class="add-producto--form-content">
					<label for="nombre" class="add-producto--form-label">Nombre:</label>
					<form:input path="nombre" class="add-producto--form-input" />
				</div>
				<div class="add-producto--form-content">
					<label for="descripcion" class="add-producto--form-label">Descripcion:</label>
					<form:input path="descripcion" class="add-producto--form-input" />
				</div>
				<div class="add-producto--form-content">
					<label for="marca" class="add-producto--form-label">Marca:</label>
					<form:select path="marca" class="add-producto--form-input">
						<form:options items="${marcas}" itemValue="id_marca"
							itemLabel="nombre" />
					</form:select>
				</div>
				<div class="add-producto--form-content">
					<label for="stock" class="add-producto--form-label">Stock:</label>
					<form:input path="stock" class="add-producto--form-input" />
				</div>
				<div class="add-producto--form-content">
					<label for="precio" class="add-producto--form-label">Precio:</label>
					<form:input path="precio" class="add-producto--form-input" />
				</div>
				<div>
					<input class="add-producto--form-button" type="reset" value="Cancelar">
					<input class="add-producto--form-button" type="submit" value="Añadir" />
				</div>
			</div>
		</form:form>
    </div>
	</section>


</body>
</html>