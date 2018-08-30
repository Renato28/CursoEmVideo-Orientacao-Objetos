package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Reptil extends Animal {

	// atributos

	protected String corDaEscama;

	// metodo getter e setter

	public String getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		this.corDaEscama = corDaEscama;
	}

	// sobreposicao dos metodos abstratos da classe Animal

	@Override
	public void locomover() {
		
		System.out.println("rastejando");
	}

	@Override
	public void alimentar() {
		
		System.out.println("comendo vegetais");
	}

	@Override
	public void emitirSom() {
		
		System.out.println("som de reptil");

	}
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Peso: " + this.peso + " idade: " + this.idade + " membros: " + this.membros + " cor da escama: "
				+ this.corDaEscama;
	}

}
