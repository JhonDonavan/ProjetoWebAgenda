<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <script language= "JavaScript">
alert("Contato cadastrado com sucesso\nVoce será redircionado.");

setTimeout("document.location = 'mvc?logica=ListaContatosLogic'",1000);
</script> -->
<p align="center">
<!-- <h3><a href="mvc?logica=ListaContatosLogic">Clique aqui para ser redirecionado</a></h3> -->
<% response.sendRedirect("mvc?logica=ListaContatosLogic"); %>
</p>
</body>
</html>