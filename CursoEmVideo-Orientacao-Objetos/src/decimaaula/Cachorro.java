package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Cachorro extends Mamifero {

	// metodos

	public void enterrarOsso() {

		System.out.println("enterrando osso");
	}

	public void abanarRabo() {

		System.out.println("abanando o rabo");
	}
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Peso: " + this.peso + " idade: " + this.idade + " membros: " + this.membros;
	}

}
