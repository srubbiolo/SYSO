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
<script src='${pageContext.request.contextPath}/resources/scripts/jquery-ui.js'></script>
<script src='${pageContext.request.contextPath}/resources/scripts/paging.js'></script>
<script src='${pageContext.request.contextPath}/resources/scripts/paginationScript.js'></script>

<title>LISTA-MARCAS</title>
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
		<h1>Marcas</h1>
	    <table id="paginationTable" cellspacing='0'>
	
		<!-- START Table Header -->
		<thead>
			<tr>
				<th>Id de marca</th>
				<th>Nombre de marca</th>
				<th>Teléfono</th>
				<th>e-Mail</th>
			</tr>
		</thead>
		<!-- END Table Header -->
	
		<!-- START Table Body -->
		<tbody>
		<c:forEach var="m" items="${marcas}">
			<tr>
				<td>${m.getId_marca()}</td>
				<td>${m.getNombre()}</td>
				<td>${m.getTelefono()}</td>
				<td>${m.getEmail()}</td>
			</tr>
			 </c:forEach>
		</tbody>
		<!-- END Table Body -->
	
		</table>
	</div>
	</section>
</body>
</html>