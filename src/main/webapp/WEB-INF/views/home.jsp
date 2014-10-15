<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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

	<div class="backgroundImage" > <!--This is the background image--> </div>

	<section class="container">
	<div class="header">
		<a href="/ferreteria/home.html">
			<img id="logo" alt="" url="/home"
				src='${pageContext.request.contextPath}/resources/images/logoFerreteria.png'>
		</a>
		<div id="user">Hola XXXXXX</div>
		<ul class="buttons">
			<li><a href="/ferreteria/marcas.html" class="productos">Listar Marcas</a></li>
			<li><a href="/ferreteria/pedidos.html" class="productos">Listar Pedidos</a></li>
			<li><a href="/ferreteria/productos.html" class="productos">Listar Productos</a></li>
			<li><a href="/ferreteria/usuarios.html" class="productos">Listar Usuarios</a></li>
			<li><a href="/ferreteria/registerUser.html" class="productos">Registrar Usuario</a></li>
			<li><a href="/ferreteria/registerBrand.html" class="productos">Registrar Marca</a></li>
			<li><a href="/ferreteria/registerProduct.html" class="productos">Registrar Producto</a></li>
			<li><a href="/ferreteria/index.html" class="productos">Salir</a></li>
		</ul>
	</div>
	<div class="homeInfo" >
		<p>Esta es cierta información sobre la home page</p>
	</div>
	</section>


</body>
</html>