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
 * Servlet implementation class ContatoSalvarServlet
 */
@WebServlet(name="ContatoSalvarServlet", urlPatterns="/contato.salvar")
public class ContatoSalvarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContatoSalvarServlet() { super(); }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ContatoDAO contatoDAO = new ContatoDAO();
		String nome  = request.getParameter("nome");
		String telefone  = request.getParameter("telefone");
		Contato contato = new Contato(nome, telefone);
		contatoDAO.salvar(contato);
		response.sendRedirect("contato.listar");
	}
}
