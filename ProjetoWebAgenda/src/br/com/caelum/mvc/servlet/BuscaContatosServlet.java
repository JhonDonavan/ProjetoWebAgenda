package br.com.caelum.mvc.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Agenda.DAO.ContatoDAO;
import br.com.Agenda.Modelo.Contato;

@WebServlet("/AlteraContatos")
public class BuscaContatosServlet extends HttpServlet {
	/*private static final long serialVersionUID = 1L;*/
       
  
    public BuscaContatosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		long cod = Long.parseLong(id);
		
		try {
			ContatoDAO dao = new ContatoDAO();
			Contato contato =  dao.GetContatoForId(cod);
			request.setAttribute("contato", contato);
			
			RequestDispatcher rd = request.getRequestDispatcher("/altera-contato.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
