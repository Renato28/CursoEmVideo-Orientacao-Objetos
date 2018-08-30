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
