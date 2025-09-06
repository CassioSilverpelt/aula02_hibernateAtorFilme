package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Ator implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private String pais;
	
	@ManyToMany
	@JoinTable(name="ator_filme", joinColumns =
	@JoinColumn(name="ator_id"),
	inverseJoinColumns = @JoinColumn(name = "filme_id"))
	private List<Filme> atuacoes;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public List<Filme> getFilmes(){
		return this.atuacoes;
	}
	public void setFilmes(Filme filme) {
		this.atuacoes.add(filme);
	}
}
