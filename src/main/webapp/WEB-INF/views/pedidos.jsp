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

<title>LISTA-PEDIDOS</title>
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
		<h1>Pedidos</h1>
	    <table cellspacing='0'>
	
		<!-- START Table Header -->
		<thead>
			<tr>
				<th>Id de pedido</th>
				<th>Tipo de pedido</th>
				<th>Estado de pedido</th>
				<th>Usuario</th>
				<th>Fecha de pedido</th>
				<th>Fecha de vencimiento</th>
				<th>Fecha de entrega</th>
			</tr>
		</thead>
		<!-- END Table Header -->
	
		<!-- START Table Body -->
		<tbody>
		<c:forEach var="p" items="${pedidos}">
			<tr>
				<td>${p.getId_pedido()}</td>
				<td>${p.getTipo()}</td>
				<td>${p.getEstado()}</td>
				<td>${p.getId_usuario().getDni()}</td>
				<td>${p.getFecha_abierto()}</td>
				<td>${p.getFecha_vencimiento()}</td>
				<td>${p.getFecha_entrega()}</td>
			</tr>
			 </c:forEach>
		</tbody>
		<!-- END Table Body -->
	
		</table>
	</div>
	</section>

</body>
</html>