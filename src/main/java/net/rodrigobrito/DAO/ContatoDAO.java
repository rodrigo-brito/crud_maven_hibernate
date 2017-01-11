package net.rodrigobrito.DAO;

import javax.persistence.EntityManager;
import java.util.List;
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
	
	public Contato find(long id){
		EntityManager em = JPAUtil.getEntityManager();
		return  em.find(Contato.class, id);
	}
	
	public List<Contato> findAll(){
		EntityManager em = JPAUtil.getEntityManager();
		return em.createQuery("FROM Contato").getResultList();
	}
	
	public void remove(long id){
		EntityManager em = JPAUtil.getEntityManager();
		Contato contato = this.find(id);
		em.remove(contato);
	}
}
