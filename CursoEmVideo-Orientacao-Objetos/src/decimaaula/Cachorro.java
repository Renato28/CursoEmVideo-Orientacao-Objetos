package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Cachorro extends Lobo {

	// metodos

	public void enterrarOsso() {

		System.out.println("enterrando osso");
	}

	public void abanarRabo() {

		System.out.println("abanando o rabo");
	}
	
	//sobrecarga de metodos
	
	public void reagir(String frase) {
		
	}
	
	public void reagir(int hora, int minuto) {
		
	}
	
	public void reagir(boolean dono) {
		
	}
	
	public void reagir (int idade, double peso) {
		
	}
	
	@Override
	
	//sobreposicao de metodo da classe Mamifero
	
	public void emitirSom() {
		
		System.out.println("Au! Au! Au!");
	}
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Peso: " + this.peso + " idade: " + this.idade + " membros: " + this.membros;
	}

}
