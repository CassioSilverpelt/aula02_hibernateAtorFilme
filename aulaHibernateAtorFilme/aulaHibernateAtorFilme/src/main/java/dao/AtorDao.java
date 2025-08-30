package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Ator;

public class AtorDao implements IAtorDao{

	EntityManagerFactory mf = Persistence.createEntityManagerFactory("HibJPA");
	
	
	public Ator pesquisar(String ator) {
		return null;
	}

	public void inserir(Ator ator) {
		EntityManager em = mf.createEntityManager();
		em.getTransaction().begin();
		em.persist(ator);
		em.getTransaction().commit();
		em.close();
	}

	public void remover(long id) {
		EntityManager em = mf.createEntityManager();
		em.getTransaction().begin();
		Ator ator = em.find(Ator.class, id);
		if (ator != null) {
			em.remove(ator);
		}
		em.getTransaction().commit();
		em.close();
	}

	public List<Ator> lista() {
		EntityManager em = mf.createEntityManager();
		List<Ator> atores = em.createQuery("SELECT a FROM Ator a", Ator.class).getResultList();
		em.close();
		return atores;
	}

	public List<Ator> apenasUmAtor(String nome) {
		EntityManager em = mf.createEntityManager();
		List<Ator> atores = em.createQuery("SELECT a FROM Ator a WHERE a.nome LIKE :nome", Ator.class)
					.setParameter("nome", "%" + nome + "%")
					.getResultList();
		em.close();
		return atores;
	}

	public void atualizar(Ator ator) {
		EntityManager em = mf.createEntityManager();
		em.getTransaction().begin();
		em.merge(ator);
		em.getTransaction().commit();
		em.close();
	}

}
