<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%
		String msg = (String) request.getAttribute("msg");
	%>
	<form action="AppController" method ="post">
		<%
		if(msg != null){%>
		 <h4><%=msg%></h4>
		 <%
		 }
		 %>
		 <h3>E-mail</h3>
		 <input type ="text" name = "email" size ="50">
		 
		 <h3>Senha</h3>
		 <input type ="password" name = "senha" size ="15">
		 <hr>
		 <input type="submit" value = "Acessar"> 
	</form>
	<hr>
	<form action="UsuarioController" method ="get">
		<input type = "submit" value= "Novo">
	</form>

</body>
</html>