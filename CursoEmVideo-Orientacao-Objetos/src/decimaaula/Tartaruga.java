package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Tartaruga extends Reptil {

	// sobreposicao do metodo da classe Reptil

	@Override
	public void locomover() {

		System.out.println("andando beeeem devagar!!!");
	}

	// metodo toString

	@Override
	public String toString() {
		return "Peso: " + this.peso + " idade: " + this.idade + " membros: " + this.membros;
	}

}
