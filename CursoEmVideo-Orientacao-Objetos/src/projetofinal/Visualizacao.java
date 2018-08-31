package projetofinal;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Visualizacao {

	// atributos alterados
	
	private Gafanhoto espectador;
	private Video filme;

	// construtor

	public Visualizacao(Gafanhoto espectador, Video filme) {

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

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}
	
	public void avaliar() {
		
		
	}
	
	public void avaliar(double nota) {
		
		//codigo
	}
	
	public void avaliar(float porcentagem) {
		
		//codigo
	}
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	
}
