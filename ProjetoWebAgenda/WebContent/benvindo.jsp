<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- comentario em JSP aqui: nossa primeira pagina JSP --%>
		<% 
			String mensagem = "Bem vindo ao sistema de agenda WEB!";
		%>
		
		<% 
			out.println(mensagem); 
		%>
		
		<br/>
		
		<%
			String desenvolvido = "Desenvolvido por (Jhon Donavan)";
		%> 
		<%= desenvolvido %>
		
		<br>
		
		<%
			System.out.println("Tudo foi executado!");
		%> 
		
		
		
</body>
</html>