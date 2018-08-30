package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Mamifero extends Animal {

	// atributos

	protected String corDoPelo;

	// metodo getter e setter

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	// sobreposicao dos metodos abstratos da classe Animal

	@Override
	public void locomover() {
		
		System.out.println("correndo");
	}

	@Override
	public void alimentar() {
		
		System.out.println("mamando");
	}

	@Override
	public void emitirSom() {
		
		System.out.println("som de mamifero");
	}
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Peso: " + this.peso + " Idade: " + this.idade + " Membros: " + this.membros + " cor do pelo: "
				+ this.corDoPelo;
	}

}
