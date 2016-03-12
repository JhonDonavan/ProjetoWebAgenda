package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Agenda.DAO.ContatoDAO;
import br.com.Agenda.Modelo.Contato;

public class RemoveContatoLogic implements Logica {
	
	public String  executa(HttpServletRequest req,
		HttpServletResponse res) throws Exception{
		long id = Long.parseLong(req.getParameter("id"));
		
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDAO dao = new ContatoDAO();
		dao.remove(contato);
		
		
		
		return "/lista-contatos.jsp";
	}
}
