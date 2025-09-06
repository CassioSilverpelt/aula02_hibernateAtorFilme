package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Filme implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String titulo;
	
	private String nomeDiretor;
	
	@ManyToMany (mappedBy = "atuacoes")
	private List<Ator> atores;
	
	public Filme( ) {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String nome) {
		this.titulo = nome;
	}
	public String getNomeDiretor() {
		return nomeDiretor;
	}
	public void setNomeDiretor(String nomeDiretor) {
		this.nomeDiretor = nomeDiretor;
	}
	public List<Ator> getAtores() {
		return this.atores;
	}
	public void setAtores(Ator ator) {
		this.atores.add(ator);
	}
	
}
