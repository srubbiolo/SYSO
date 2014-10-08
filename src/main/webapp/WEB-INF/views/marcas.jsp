<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Marcas</title>
</head>
<body>

<h1>Marcas</h1>
    <ul>		  
        <c:forEach var="m" items="${marcas}">
            <li>${m.getId_marca()} ${m.getNombre()} ${m.getTelefono()} ${m.getEmail()}</li>
        </c:forEach>        
    </ul>
</body>
</html>