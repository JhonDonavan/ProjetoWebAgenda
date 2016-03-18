<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
		<input type="submit" value="Alterar">
	
<c:import url="rodape.jsp" />
</body>
</html>