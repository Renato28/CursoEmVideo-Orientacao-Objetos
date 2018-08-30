package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Canguru extends Mamifero {

	//metodos
	
	public void usarBolsa() {
		
		System.out.println("usando bolsa");
	}
	
	//sobreposicao de metodo da classe Mamifero
	
	@Override
	
	public void locomover() {
		
		System.out.println("saltando");
	}
}
