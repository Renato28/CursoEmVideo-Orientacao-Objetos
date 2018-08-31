package projetofinal;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Visualizacao {

	// atributos

	private Gafanhoto espectador;
	private String filme;

	// construtor

	public Visualizacao(Gafanhoto espectador, String filme) {

		this.espectador = espectador;
		this.filme = filme;
	}
	
	//metodos getters e setters
	
	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

}
