package net.rodrigobrito.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.rodrigobrito.DAO.ContatoDAO;
import net.rodrigobrito.model.Contato;

/**
 * Servlet implementation class ContatoExcluirServlet
 */
@WebServlet(name="ContatoExcluirServlet", urlPatterns="/contato.excluir")
public class ContatoExcluirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContatoDAO contatoDAO = new ContatoDAO();
		long idContato = Long.parseLong( request.getParameter("id") );
		contatoDAO.remove( idContato );
		System.out.println("Excluindo... "+request.getParameter("id"));
		response.sendRedirect("contato.listar");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doDelete(req, resp);
	}	
}
