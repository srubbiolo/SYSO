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

<title>LISTA-PRODUCTOS</title>
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
        <form:form id="registerProductForm" action="registerProduct" method="post" commandName="userForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Registrar Producto</h2></td>
                </tr>
                <tr>
                    <td>Nombre:</td>
                    <td><form:input id="box1" path="nombre" /></td>
                </tr>
                <tr>
                    <td>Descripcion:</td>
                    <td><form:input id="box2" path="descripcion" /></td>
                </tr>
                 <tr>
                    <td>ID Marca:</td>
                    <td><form:select id="box3" path="marca" items="${tipoUserList}" /></td>
                </tr>
                <tr>
                    <td>Stock:</td>
                    <td><form:input id="box5" path="stock" /></td>
                </tr>
                <tr>
                    <td>Precio:</td>
                    <td><form:input id="box4" path="precio" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input id="submitFormbutton"type="submit" value="Registrar" /></td>
                </tr>
            </table>
        </form:form>
    </div>
	</section>


</body>
</html>