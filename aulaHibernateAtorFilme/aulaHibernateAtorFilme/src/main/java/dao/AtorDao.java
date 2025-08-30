package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Ator;

public class AtorDao implements IAtorDao{

	EntityManagerFactory mf = Persistence.createEntityManagerFactory("HibJPA");
	
	
	@Override
	public Ator pesquisar(String ator) {
		return null;
	}

	@Override
	public void inserir(Ator ator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ator> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ator> apenasUmFilme(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
