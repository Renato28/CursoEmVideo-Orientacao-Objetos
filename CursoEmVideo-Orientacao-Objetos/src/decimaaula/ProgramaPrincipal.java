package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//criando um objeto e atribuindo valores aos atributos
		
		Mamifero mamifero = new Mamifero();
		mamifero.setPeso(20.5);
		mamifero.setIdade(10);
		mamifero.setMembros(4);
		mamifero.setCorDoPelo("preto");
		
		//executando os metodos da classe Mamifero
		
		mamifero.alimentar();
		mamifero.emitirSom();
		mamifero.locomover();
		
		//executando os valores dos atributos e metodos da classe Mamifero
		
		System.out.println(mamifero);
	}

}
