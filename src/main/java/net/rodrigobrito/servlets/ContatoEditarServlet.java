package net.rodrigobrito.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.rodrigobrito.DAO.ContatoDAO;

/**
 * Servlet implementation class ContatoEditarServlet
 */
@WebServlet(urlPatterns="/contato.editar")
public class ContatoEditarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContatoDAO contatoDAO = new ContatoDAO();
		request.setAttribute("contato", contatoDAO.find(Long.parseLong(request.getParameter("id"))));
		request.getRequestDispatcher("views/editar.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
