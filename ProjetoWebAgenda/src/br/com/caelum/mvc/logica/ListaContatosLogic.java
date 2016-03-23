package br.com.caelum.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Agenda.DAO.ContatoDAO;
import br.com.Agenda.Modelo.Contato;

public class ListaContatosLogic implements Logica {
		public String executa(HttpServletRequest request, 
			HttpServletResponse response) throws Exception{
			List<Contato> contatos = new ContatoDAO().getLista();
			
			request.setAttribute("contatos", contatos);
			
			return "lista-contatos.jsp";
		}

}
