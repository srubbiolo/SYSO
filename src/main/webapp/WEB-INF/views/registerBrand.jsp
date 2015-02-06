<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!--Style Sheets-->
<link type="text/css" rel="stylesheet" href='${pageContext.request.contextPath}/resources/styles/index.css' />
<link type="text/css" rel="stylesheet" href='${pageContext.request.contextPath}/resources/styles/alertify.default.css' />
<link type="text/css" rel="stylesheet" href='${pageContext.request.contextPath}/resources/styles/alertify.core.css' />
	
<!--Scripts-->
<script src='${pageContext.request.contextPath}/resources/scripts/jquery-1.9.1.min.js'></script> 
<script type="text/javascript" src='${pageContext.request.contextPath}/reso	urces/scripts/forms.js'></script>
<script type="text/javascript" src='${pageContext.request.contextPath}/reso	urces/scripts/alertify.min.js'></script>

<title>LISTA-PRODUCTOS</title>
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
	    <div align="center">
        <form:form id="registerBrandForm" action="registerBrand" method="post" commandName="userForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Registrar Marca</h2></td>
                </tr>
                <tr>
                    <td>Nombre:</td>
                    <td><form:input id="box1" class="required" path="nombre" /></td>
                </tr>
                <tr>
                    <td>Tel. Contacto:</td>
                    <td><form:input id="box3" class="required" path="telefono" /></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td><form:input id="box2" class="required" path="email" /></td>
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