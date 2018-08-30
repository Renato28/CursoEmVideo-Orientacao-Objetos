package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Canguru extends Mamifero {

	// metodos

	public void usarBolsa() {

		System.out.println("usando bolsa");
	}

	// sobreposicao de metodo da classe Mamifero

	@Override

	public void locomover() {

		System.out.println("saltando");
	}
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Peso: " + this.peso + " idade: " + this.idade + " membros: " + this.membros;
	}

}
