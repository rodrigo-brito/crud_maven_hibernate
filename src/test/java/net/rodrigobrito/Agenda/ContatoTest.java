package net.rodrigobrito.Agenda;

import static org.junit.Assert.*;

import org.junit.Test;

import net.rodrigobrito.DAO.ContatoDAO;
import net.rodrigobrito.model.Contato;

public class ContatoTest {

	@Test
	public void test() {
		Contato contato = new Contato("Rodrigo", "9999-9999");
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.salvar(contato);
	}

}
