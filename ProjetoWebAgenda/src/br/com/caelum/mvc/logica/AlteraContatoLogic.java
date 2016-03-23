package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Agenda.DAO.ContatoDAO;
import br.com.Agenda.Modelo.Contato;

public abstract class AlteraContatoLogic implements Logica{
	public String execut(HttpServletRequest request, 
		HttpServletResponse response ) throws Exception {
		
		Contato contato = new Contato();
		
		String identificador = request.getParameter("id");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String dataNascimento = request.getParameter("dataNascimento");
		
		long id = Long.parseLong( "identificador" );
		
		contato.setId(id);
		contato.setNome(nome);
		contato.setEmail(email);
		contato.getEndereco();
		contato.getDataNascimento();
		
		ContatoDAO dao = new ContatoDAO();
		
		dao.alterar(contato);
		
		
		
		
		
		
		
		
		return "contato-alterado.jsp";
	}

	
}
