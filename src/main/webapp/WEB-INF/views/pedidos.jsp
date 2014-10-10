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

<title>LISTA-PEDIDOS</title>
</head>
<body>
	<section class="container">
	<div class="header">
		<a href="/ferreteria/home.html">
			<img id="logo" src='${pageContext.request.contextPath}/resources/images/logoFerreteria.png'>
		</a>
		<ul class="buttons">
			<li><a href="/ferreteria/home.html" class="home">Volver</a></li>
		</ul>
	</div>
			</div>
			<h1>Pedidos</h1>
			<div class="result-container" id="resContainer">
				<c:forEach var="p" items="${pedidos}">
					<div>
						<ul class="stock-list">
							<li class="stock-row">Tipo pedido: ${p.getTipo()}
							<br> <label>Estado: ${p.getEstado()}</label>
							<br> <label>Usuario: ${p.getId_usuario().getDni()}</label>
							<br> Fecha de pedido: ${p.getFecha_abierto()}</label>
							<br> Fecha de vencimiento: ${p.getFecha_vencimiento()}
							<br> Fecha de entrega: ${p.getFecha_entrega()}</li>
						</ul>
						</c:forEach>
			</div>	
	</section>


</body>
</html>