<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<title>SYSFER-HOME</title>
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
				<div class="form-container">
				<form class="search-form">
					<input type="text" class="search-input" placeholder="Busca un pedido..."/>
					<input type="submit" class="search-button" value="Buscar" id="searchButton" onclick="createBlock()"/>
				</form>
			</div>
			<div class="result-container" id="resContainer">
				<c:forEach var="p" items="${pedidos}">
					<div>
						<ul class="stock-list">
							<li class="stock-row">Tipo pedido: ${p.getTipo()}</li>
							<li class="stock-row">Estado: ${p.getEstado()}</li>
							<li class="stock-row">Usuario: ${p.getId_usuario().getDni()}</li>
							<li class="stock-row">Fecha de pedido: ${p.getFecha_abierto()}</li>
							<li class="stock-row">Fecha de vencimiento: ${p.getFecha_vencimiento()}</li>
							<li class="stock-row">Fecha de entrega: ${p.getFecha_entrega()}</li>
						</ul>
						</c:forEach>
			</div>	
	</section>


</body>
</html>