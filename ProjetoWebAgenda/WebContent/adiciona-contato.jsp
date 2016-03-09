<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Adcionar contatos</title>
</head>
<body>
<c:import url="cabecalho.jsp" />	
	<h1>Adiciona contatos</h1>
	<hr>
	<form action="adicionaContato">
		<table>
		<tr>
		<td>Nome:</td>
		<td><input type="text" name="nome"/></td>
		</tr>
		<tr>
		<td>E-Mail:</td>
		<td><input type="text" name="email"/></td>
		</tr>
		<tr>
		<td>Endereço:</td>
		<td><input type="text" name="endereco"/><td>
		</tr>
		<tr>
		<td>Data de Nascimento:</td> 
		<td><input type="text" name="dataNascimento"/></td>
		</tr>
		</table>
		<input type="submit" value="Gravar">
	</form>
<c:import url="rodape.jsp" />
</body>
</html>