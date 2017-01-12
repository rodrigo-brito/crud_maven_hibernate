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
 * Servlet implementation class ContatoAtualziarServlet
 */
@WebServlet(name="ContatoAtualziarServlet", urlPatterns="/contato.atualizar")
public class ContatoAtualziarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ContatoDAO contatoDAO = new ContatoDAO();
		Contato contato = contatoDAO.find(Long.parseLong( request.getParameter("id")));
		contato.setNome(request.getParameter("nome"));
		contato.setTelefone(request.getParameter("telefone"));
		contato.setTelefone(request.getParameter("email"));
		contatoDAO.update(contato);
		response.sendRedirect("contato.listar");
	}
}
