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
		
		<a id="loginLink" href="/ferreteria/login.html"> Iniciar Sesi�n </a>
	</div>
	<div class="homeInfo" >
		<p>Esta es cierta informaci�n sobre la home page</p>
	</div>
	</section>


</body>
</html>