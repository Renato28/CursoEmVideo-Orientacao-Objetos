package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//criando um objeto e atribuindo valores aos atributos da classe Mamifero
		
		Mamifero mamifero = new Mamifero();
		mamifero.setPeso(20.5);
		mamifero.setIdade(10);
		mamifero.setMembros(4);
		mamifero.setCorDoPelo("preto");
		
		//executando os metodos da classe Mamifero
		
		mamifero.alimentar();
		mamifero.emitirSom();
		mamifero.locomover();
		
		//executando os valores dos atributos da classe Mamifero
		
		System.out.println(mamifero);
		
		//criando um objeto e atribuindo valores aos atributos da classe Reptil
		
		Reptil reptil = new Reptil();
		reptil.setPeso(12.7);
		reptil.setIdade(5);
		reptil.setMembros(4);
		reptil.setCorDaEscama("marrom");
		
		//executando os metodos da classe Reptil
		
		reptil.alimentar();
		reptil.emitirSom();
		reptil.locomover();
		
		//executando os valores dos atributos da classe Reptil
		
		System.out.println(reptil);
		
		//criando um objeto e atribuindo valores aos atributos da classe Peixe
		
		Peixe peixe = new Peixe();
		peixe.setPeso(14.5);
		peixe.setIdade(8);
		peixe.setMembros(0);
		peixe.setCorDaEscama("amarelo");
		
		//executando os metodos da classe Peixe
		
		peixe.alimentar();
		peixe.emitirSom();
		peixe.locomover();
		peixe.soltarBolha();
		
		//executando os valores dos atributos da classe Peixe
		
		System.out.println(peixe);
	}

}
