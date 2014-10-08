<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usuarios</title>
</head>
<body>
	<h1>Usuarios</h1>
    <ul>
        <c:forEach var="u" items="${usuarios}">
        <li>${u.getId_Usuario()} ${u.getDni()} ${u.getEmail()} ${u.getContraseña()} ${u.getId_permiso().getDescripcion()}</li>
        </c:forEach>
    </ul>

</body>
</html>