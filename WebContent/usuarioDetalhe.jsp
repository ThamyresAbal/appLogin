<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UsuarioController" method= "post">
		 		 
		 <h3>Nome</h3>
		 <input type ="text" name = "nome">
		 
		 <h3>E-mail</h3>
		 <input type ="text" name = "email">
		 
		 <h3>Senha</h3>
		 <input type ="password" name = "senha" >
		 
		 <h3>Idade</h3>
		 <input type ="text" name = "idade">
		 <hr>
		 
		 <input type="submit" value = "Gravar"> 
	</form>
	
	

</body>
</html>