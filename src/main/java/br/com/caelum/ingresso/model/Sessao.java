package br.com.caelum.ingresso.model;

@Entity
public class Sessao {
	
	@Id
	@GeneratedValue
	private Integer id;
	private LocalTime horario;

	@ManyToOne
	private Sala sala;
	
	@ManyToOne
	private Filme filme;
	
	
	/**
	 * @deprecated hibernate only 
	 */
	
	public Sessao(){
		
	}
	
	
	
}
