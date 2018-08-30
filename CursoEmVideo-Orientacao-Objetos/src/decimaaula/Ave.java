package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Ave extends Animal {

	// atributos

	protected String corPena;

	// metodo getter e setter

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	//metodos
	
	public void fazerNinho() {
		
		System.out.println("fazendo ninho");
	}

	// sobreposicao dos metodos abstratos da classe Animal

	@Override
	public void locomover() {

		System.out.println("voando");
	}

	@Override
	public void alimentar() {

		System.out.println("comendo frutas");
	}

	@Override
	public void emitirSom() {

		System.out.println("som de ave");
	}
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Peso: " + this.peso + " idade: " + this.idade + " membros: " + this.membros + " cor da pena: "
				+ this.corPena;
	}

}
