<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!--Style Sheets-->
<link href='${pageContext.request.contextPath}/resources/styles/owl.carousel.css' rel="stylesheet">
<link href='${pageContext.request.contextPath}/resources/styles/owl.theme.css' rel="stylesheet">
<link type="text/css" rel="stylesheet" href='${pageContext.request.contextPath}/resources/styles/index.css' />

<!--Scripts-->
<script src='${pageContext.request.contextPath}/resources/scripts/jquery-1.9.1.min.js'></script> 
<script src='${pageContext.request.contextPath}/resources/scripts/owl.carousel.js'></script>
<script type="text/javascript" src='${pageContext.request.contextPath}/resources/scripts/script.js'></script>

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
		<h1>Bienvenido</h1>
		
			<div id="textoBienvenida">
			
			<p>En SYSFER sabemos que usted construye en su tiempo libre, y que su tiempo es valioso. 
			   Por eso lo valoramos brindándole una tienda virtual en donde usted se encontrará con las 
			   marcas líderes en construcción y con los mejores productos. Todo esto con una atención virtual 
			   personalizada.
			</p>
			
		</div>
		
		<div id="brands" class="owl-carousel">
                <div class="item"><img src='${pageContext.request.contextPath}/resources/images/logos/3M.jpg' alt="Brand Image"></div>
                <div class="item"><img src='${pageContext.request.contextPath}/resources/images/logos/blackAnddecker.jpg' alt="Brand Image"></div>
                <div class="item"><img src='${pageContext.request.contextPath}/resources/images/logos/bosch.jpg' alt="Brand Image"></div>
                <div class="item"><img src='${pageContext.request.contextPath}/resources/images/logos/cat.jpg' alt="Brand Image"></div>
                <div class="item"><img src='${pageContext.request.contextPath}/resources/images/logos/Dewalt.jpg' alt="Brand Image"></div>
                <div class="item"><img src='${pageContext.request.contextPath}/resources/images/logos/dynabrade.jpg' alt="Brand Image"></div>
                <div class="item"><img src='${pageContext.request.contextPath}/resources/images/logos/husky.jpg' alt="Brand Image"></div>
                <div class="item"><img src='${pageContext.request.contextPath}/resources/images/logos/karcher.jpg' alt="Brand Image"></div>
                <div class="item"><img src='${pageContext.request.contextPath}/resources/images/logos/skil.jpg' alt="Brand Image"></div>
                <div class="item"><img src='${pageContext.request.contextPath}/resources/images/logos/stanley.jpg' alt="Brand Image"></div>
        </div>
        
	</section>


</body>
</html>