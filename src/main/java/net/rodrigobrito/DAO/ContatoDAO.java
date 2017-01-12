package net.rodrigobrito.DAO;

import javax.persistence.EntityManager;
import java.util.List;
import net.rodrigobrito.model.Contato;
import net.rodrigobrito.util.JPAUtil;

public class ContatoDAO {
	public void save(Contato contato){
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(Contato contato){
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(contato);
		em.getTransaction().commit();
		em.close();
	}
	
	
	public Contato find(long id){
		EntityManager em = JPAUtil.getEntityManager();
		Contato contato = em.find(Contato.class, id);
		em.close();
		return contato;
	}
	
	public List<Contato> findAll(){
		EntityManager em = JPAUtil.getEntityManager();
		List<Contato> listaContatos = em.createQuery("FROM Contato").getResultList();
		em.close();
		return listaContatos;
	}
	
	public void remove(long id){
		EntityManager em = JPAUtil.getEntityManager();
		Contato contato = em.getReference(Contato.class, id);
		em.getTransaction().begin();
		em.remove(contato);
		em.getTransaction().commit();
		em.close();
	}
}
