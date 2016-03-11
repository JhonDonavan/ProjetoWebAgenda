<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Adcionar contatos</title>
	<link href="css/jquery-ui.css" rel="stylesheet">
	<!-- <link href="css/jquery-ui.min.css" rel="stylesheet">
	<link href="css/jquery-ui.structure.css" rel="stylesheet">
	<link href="jquery-ui.structure.min.css" rel="stylesheet">
	<link href="jquery-ui.theme.css" rel="stylesheet">
	<link href="jquery-ui.theme.min.css" rel="stylesheet"> -->
	<script src="js/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
</head>
<body>
<c:import url="cabecalho.jsp" />	
	<h1>Adicionar contatos</h1>
	<hr>
	<form action="adicionaContato" method="post">
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
		<td><caelum:campoData id="dataNascimento" /></td>
		</tr>
		</table>
		<input type="submit" value="Gravar">
	</form>
<c:import url="rodape.jsp" />
</body>
</html>