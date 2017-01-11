package net.rodrigobrito.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.rodrigobrito.DAO.ContatoDAO;
import net.rodrigobrito.model.Contato;

/**
 * Servlet implementation class AgendaServlet
 */

public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContatoDAO contatoDAO;
	
	public AgendaServlet(){
		super();
		contatoDAO = new ContatoDAO();
	}
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Contato> contatos = contatoDAO.findAll();
		request.setAttribute("contatos", contatos);
		request.getRequestDispatcher("views/agenda.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
