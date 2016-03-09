<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- ISO-8859-1 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="cabecalho.jsp" />

<jsp:useBean id="dao" class="br.com.Agenda.DAO.ContatoDAO"/>


 <table border="1">
	<!-- percorre contatos montando as linhas da tabela -->
	<tr bgcolor="#	66CCFF">
		<td>Nome</td>
		<td>Email</td>
		<td>Endereço</td>
		<td>Data de Nascimento</td>
	</tr>
	<c:forEach var="contato" items="${dao.lista}" varStatus="id">
	<tr bgcolor="#${id.count % 2 == 0 ? 'E0E0E0' : 'ffffff' }">
		<td>${contato.nome}</td>
		<%-- <td>
			<c:if test="${not empty contato.email }">
			<a href="mailto:${contrato.email}">$contato.email</a>	
			</c:if>
		</td> --%>
		<td>
			<c:choose>
				<c:when test="${not empty contato.email}">
					<a href="mailto:${contato.email}">${contato.email}></a>
				</c:when>
				<c:otherwise>
					E-Mail não informado
				</c:otherwise>
			</c:choose>
		</td>
		<td>${contato.endereco}</td>
		<td><fmt:formatDate value="${contato.dataNascimento.time}" 
		pattern="dd/MM/yyyy"/></td>
	</tr>
	</c:forEach>
</table>
<c:import url="rodape.jsp" />
</body>
</html>