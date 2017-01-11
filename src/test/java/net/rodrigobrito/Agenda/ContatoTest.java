package net.rodrigobrito.Agenda;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import net.rodrigobrito.DAO.ContatoDAO;
import net.rodrigobrito.model.Contato;

public class ContatoTest {
	
	private ContatoDAO contatoDAO;
	private long idContatoInserted;

	@Before
	public void Before(){
		contatoDAO = new ContatoDAO();
	}	
	
	@Test
	public void testInsert() {
		Contato contato = new Contato("Rodrigo", "9999-9999");
		contatoDAO.salvar(contato);		
		Contato contatoRecordered = contatoDAO.find( contato.getId() );
		assertNotEquals(contatoRecordered, null);
		idContatoInserted = contatoRecordered.getId();
	}
	
	@Test
	public void testeFindAll() {
		List<Contato> contatos = contatoDAO.findAll();
		assert(contatos.size() > 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void remove(){
		contatoDAO.remove( idContatoInserted );
		Contato contatoRemoved = contatoDAO.find( idContatoInserted );
	}
}
