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

	}

	@Override
	public void alimentar() {

	}

	@Override
	public void emitirSom() {

	}

}
