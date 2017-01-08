package net.rodrigobrito.DAO;

import javax.persistence.EntityManager;

import net.rodrigobrito.model.Contato;
import net.rodrigobrito.util.JPAUtil;

public class ContatoDAO {
	public void salvar(Contato contato){
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
		em.close();
	}
}
