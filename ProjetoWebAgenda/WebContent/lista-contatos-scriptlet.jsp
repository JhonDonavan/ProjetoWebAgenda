<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,
	java.text.SimpleDateFormat,
	java.sql.Date,
	java.util.Calendar,
	br.com.Agenda.DAO.ContatoDAO,
	br.com.Agenda.Modelo.Contato" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1">
		<tr>
			<td>Nome</td>
			<td>E-Mail</td>
			<td>Endere�o</td>
			<td>Data de Nascimento</td>
		</tr>
		<%	
			ContatoDAO dao = new ContatoDAO();
			List<Contato> contatos = dao.getLista();
			SimpleDateFormat dataformatada = new SimpleDateFormat("dd/MM/yyyy");
			
			for(Contato contato : contatos){
			
		%>		
			<tr>
				<td><%=contato.getNome() %></td>
				<td><%=contato.getEmail() %></td>
				<td><%=contato.getEndereco() %></td>
				<td><%=dataformatada.format(contato.getDataNascimento().getTime())%></td>
			</tr>	
			<%
			}
			 %>
	 </table>
</body>
</html>