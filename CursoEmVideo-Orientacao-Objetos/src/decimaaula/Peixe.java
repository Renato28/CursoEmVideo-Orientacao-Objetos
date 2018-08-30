package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Peixe extends Animal{

	// atributos

	protected String corDaEscama;
	
	//metodo getter e setter
	
	public String getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		this.corDaEscama = corDaEscama;
	}

	//sobreposicao dos metodos abstratos da classe Animal
	
	@Override
	public void locomover() {
		
		System.out.println("nadando");
	}

	@Override
	public void alimentar() {
		
		System.out.println("comendo substancias");
	}

	@Override
	public void emitirSom() {
		
		System.out.println("peixe não faz som");
	}

	
}
