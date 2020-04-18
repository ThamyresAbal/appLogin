<%@page import="negocio.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
</head>
<body>
<%
Usuario printUser = (Usuario)request.getAttribute("printUsuario");
%>
	<form action="AppController" method ="get">
	
		<h4>Olá,<%=printUser.getNome() %> (<%=printUser.getEmail() %>)!</h4>
	
		<hr>

		<input type = "submit" value= "Sair">
	</form>
	
	

</body>
</html>