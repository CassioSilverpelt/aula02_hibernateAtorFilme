package model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class AtorFilme {
	@Id
	@ManyToOne
	@JoinColumn(name="ator_id")
	private Ator ator;
	
	@Id
	@ManyToOne
	@JoinColumn(name="filme_id")
	private Filme filme;
	
}
